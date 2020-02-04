package com.el;

import com.el.entity.Person;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ELTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello world'");
        String msg = (String) exp.getValue();
        System.out.println(msg);

        System.out.println();
        Expression exp2 = parser.parseExpression("'Hello world'.bytes.length");
        int length = (Integer) exp2.getValue();
        System.out.println(length);

        System.out.println();
        Expression exp3 = parser.parseExpression("'Hello world'.bytes");
        byte[] bytes = (byte[]) exp3.getValue();
        System.out.println(Arrays.toString(bytes));

        System.out.println();
        Expression exp4 = parser.parseExpression("new String('hello world')");
        String msg2 = exp4.getValue(String.class);
        System.out.println(msg2);

        System.out.println();
        List nums = (List) parser.parseExpression("{1,2,3,4}").getValue(List.class);
        System.out.println(nums);

        System.out.println();
        Map map = (Map) parser.parseExpression("{name:'Dave',age:'26'}").getValue(Map.class);
        System.out.println(map);

        System.out.println();
        int[] num = (int[]) parser.parseExpression("new int[]{1,2,3,4}").getValue();
        System.out.println(Arrays.toString(num));

        System.out.println();
        String subStr = parser.parseExpression("'abc'.substring(1,3)").getValue(String.class);
        System.out.println(subStr);

        System.out.println();
        Boolean flag = parser.parseExpression("2 == 2").getValue(Boolean.class);
        System.out.println(flag);

        System.out.println();
        Integer value = parser.parseExpression("6 / 3").getValue(Integer.class);
        System.out.println(value);

        Person person = new Person();
        parser.parseExpression("Name").setValue(person,"Dave");
        String name = parser.parseExpression("Name = 'Dave'").getValue(person,String.class);
        System.out.println(name);
    }
}
