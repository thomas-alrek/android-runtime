package com.telerik.metadata.parsing;

import com.telerik.metadata.ClassRepo;
import com.telerik.metadata.desc.ClassDescriptor;
import com.telerik.metadata.desc.MethodDescriptor;

import java.util.HashSet;
import java.util.Set;

public final class ClassParser {

    private final ClassDescriptor clazz;

    private ClassParser(ClassDescriptor clazz) {
        this.clazz = clazz;
    }

    public static ClassParser forClassDescriptor(ClassDescriptor clazz) {
        return new ClassParser(clazz);
    }

    public Set<MethodDescriptor> getAllDefaultMethodsFromImplementedInterfaces() {
        return getAllDefaultMethodsFromImplementedInterfacesRecursively(clazz, new HashSet<MethodDescriptor>());
    }

    private HashSet<MethodDescriptor> getAllDefaultMethodsFromImplementedInterfacesRecursively(ClassDescriptor clazz, HashSet<MethodDescriptor> collectedDefaultMethods) {
        String[] implementedInterfacesNames = clazz.getInterfaceNames();

        for (String implementedInterfaceName : implementedInterfacesNames) {
            ClassDescriptor interfaceClass = ClassRepo.findClass(implementedInterfaceName);

            if (interfaceClass == null) {
                System.out.println(String.format("WARNING: Skipping interface %s implemented in %s as it cannot be resolved", implementedInterfaceName, clazz.getClassName()));
                continue;
            }

            for (MethodDescriptor md : interfaceClass.getMethods()) {
                if (!md.isStatic() && !md.isAbstract()) {
                    collectedDefaultMethods.add(md);
                }
            }

            collectedDefaultMethods.addAll(getAllDefaultMethodsFromImplementedInterfacesRecursively(interfaceClass, new HashSet<MethodDescriptor>()));
        }

        return collectedDefaultMethods;
    }
}
