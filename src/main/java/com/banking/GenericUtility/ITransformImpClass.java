package com.banking.GenericUtility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation;

public class ITransformImpClass  implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {

	annotation.setRetryAnalyzer(com.banking.GenericUtility.RetrImplClass.class);
	
	}
	
	

}
