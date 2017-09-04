package com.meituan.robust.autopatch;

import com.meituan.robust.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;

import javassist.ClassPool;
import javassist.CtMethod;

import static com.meituan.robust.Constants.DEFAULT_MAPPING_FILE;

/**
 * Created by mivanzhang on 16/12/2.
 * <p>
 * members read from robust.xml
 */

public final class Config {
    public static final String ROBUST_TRANSFORM_MAIN_JAR = "robust_transform_main.jar";
    public static final String ROBUST_PROGUARD_MAIN_JAR = "robust_proguard_main.jar";

    public static boolean catchReflectException = false;
    public static boolean supportProGuard = true;
    public static boolean isLogging = true;
    public static boolean isManual = false;
    public static String patchPackageName = Constants.PATCH_PACKAGENAME;
    public static String mappingFilePath;
    public static Set<String> patchMethodSignatureSet = new HashSet<>();
    public static List<String> newlyAddedClassNameList = new ArrayList<String>();
    public static Set newlyAddedMethodSet = new HashSet<String>();
    public static List<String> modifiedClassNameList = new ArrayList<String>();
    public static List<String> modifiedAnonymousInnerClassNameList = new ArrayList<String>();
    public static List<String> lambdaDotClassNameList = new ArrayList<String>();
    public static JarFile oldJar ;
    public static JarFile newJar ;
    public static HashMap<String,String> lambdaUnchangedReallyClassNameList = new HashMap<String, String>();
    public static List<String> hotfixPackageList = new ArrayList<>();
    public static List<String> exceptPackageList = new ArrayList<>();
    public static HashMap<String, String> methodMap = new HashMap<String, String>();
    public static HashMap<String, String> newMethodMap = new HashMap<String, String>();
    public static String robustGenerateDirectory;
    public static Map<String, List<CtMethod>> invokeSuperMethodMap = new HashMap<>();
    public static ClassPool classPool = new ClassPool();
    public static ClassPool oldClassPool = new ClassPool();
    public static Set methodNeedPatchSet = new HashSet();
    public static List<CtMethod> addedSuperMethodList = new ArrayList<>();
    public static Set<String> noNeedReflectClassSet = new HashSet<>();

    public static boolean patchHasDex = false;
    public static boolean patchHasResource = false;
    public static boolean isResourceFix = false;
    public static String RDotTxtFilePath;
    public static String oldApkPath;
    public static String newApkPath;
    public static int bigFileSizeAtLeast;
    public static boolean debug = false;
    //assets
    public static HashSet<String> assetsInclude = new HashSet<>();
    public static HashSet<String> assetsExclude = new HashSet<>();
    //res
    public static HashSet<String> resInclude = new HashSet<>();
    public static HashSet<String> resExclude = new HashSet<>();
    //lib
    public static HashSet<String> libInclude = new HashSet<>();
    public static HashSet<String> libExclude = new HashSet<>();


    public static void init() {
        catchReflectException = false;
        isLogging = true;
        isManual = false;
        patchPackageName = Constants.PATCH_PACKAGENAME;
        mappingFilePath = DEFAULT_MAPPING_FILE;
        patchMethodSignatureSet = new HashSet<>();
        newlyAddedClassNameList = new ArrayList<String>();
        modifiedClassNameList = new ArrayList<String>();
        hotfixPackageList = new ArrayList<>();
        newlyAddedMethodSet = new HashSet<>();
        invokeSuperMethodMap = new HashMap<>();
        classPool = new ClassPool();
        methodNeedPatchSet = new HashSet();
        addedSuperMethodList = new ArrayList<>();
        noNeedReflectClassSet = new HashSet<>();
        noNeedReflectClassSet.addAll(Constants.NO_NEED_REFLECT_CLASS);
        supportProGuard = true;
    }

}
