package org.javaOOPs2.accessModifiers.protectedModifier2;

import org.javaOOPs2.accessModifiers.protectedModifier1.ProtectedModifierClass1;

public class ProtectedModifierClass2 extends ProtectedModifierClass1 {
    public ProtectedModifierClass2() {
    }

    public static void main(String[] args) {
        ProtectedModifierClass2 obj = new ProtectedModifierClass2();
        obj.show();
    }
}
