package com.matveyenka.dao;

import com.matveyenka.entity.Address;
import com.matveyenka.entity.Employee;
import com.matveyenka.entity.Gender;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
//



//    @Test
//    public void test() {
//        Class<Employee> employeeClass = Employee.class;
//        Field[] declaredFields = employeeClass.getDeclaredFields();
//        Arrays.stream(declaredFields).forEach(f -> System.out.println(f.getName()));
//
//        if (employeeClass.isAnnotationPresent(Table.class)) {
//            Table declaredAnnotation = employeeClass.getDeclaredAnnotation(Table.class);
//            String insert = "INSERT INTO " + declaredAnnotation.schema() + "." + declaredAnnotation.name();
//            System.out.println(insert);
//        }
//
//        Employee employee = new Employee("Ivan", Gender.MALE, new Address(), new Address());
//        Arrays.stream(declaredFields).limit(1)
//                .forEach(f -> {
//                    try {
//                        f.setAccessible(true);
//                        Object o = f.get(employee);
//                        System.out.println(o);
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
////                    if (f.isAnnotationPresent(Column.class)) {
////                        String name = f.getAnnotation(Column.class).name();
////                        if (StringUtils.isNotEmpty(name)) {
////
////                        }
////                    }
//                });
//    }
//
//    @Test
//    public void checkConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<Employee> employeeClass = Employee.class;
//        String name = "Ivan";
//        String gender = "MALE";
//
//        Constructor<Employee> constructor = employeeClass.getConstructor();
//        Employee employee = constructor.newInstance();
//        Field nameField = employeeClass.getDeclaredField("name");
//        nameField.setAccessible(true);
//        nameField.set(employee, name);
//
//        Method getNameMethod = employeeClass.getDeclaredMethod("getName");
//        Object invoke = getNameMethod.invoke(employee);
//        System.out.println(invoke);
//    }
}
