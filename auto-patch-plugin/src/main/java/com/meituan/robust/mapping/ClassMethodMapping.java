package com.meituan.robust.mapping;

/**
 * 记录class的Method的mapping
 * Created by hedex on 17/2/23.
 */

public class ClassMethodMapping {
    String className;
    int firstLineNumber;
    int lastLineNumber;
    String methodReturnType;
    String methodName;
    String methodArguments;
    String newClassName;
    int newFirstLineNumber;
    int newLastLineNumber;
    String newMethodName;

    public ClassMethodMapping(String className, int firstLineNumber, int lastLineNumber, String methodReturnType, String methodName, String methodArguments, String newClassName, int newFirstLineNumber, int newLastLineNumber, String newMethodName) {
        this.className = className;
        this.firstLineNumber = firstLineNumber;
        this.lastLineNumber = lastLineNumber;
        this.methodReturnType = methodReturnType;
        this.methodName = methodName;
        this.methodArguments = methodArguments;
        this.newClassName = newClassName;
        this.newFirstLineNumber = newFirstLineNumber;
        this.newLastLineNumber = newLastLineNumber;
        this.newMethodName = newMethodName;
    }

    @Override
    public String toString() {
        return "    " + methodReturnType + " " + methodName + " -> " + newMethodName + " " + methodArguments +" " + firstLineNumber + "~" + lastLineNumber;
    }
}