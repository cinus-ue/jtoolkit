package com.cinus.expression;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExpressionUtilsTest {
    @Test
    public void test_expression() {
        Map<String, Object> env = new HashMap<>();
        env.put("msg", "xxx message");
        String expression = "STR.endsWith(msg,'ge')";
        assertTrue((Boolean) ExpressionUtils.executeExpression(expression, env));

        env.clear();
        env.put("domain", "cinus");
        assertEquals("www.cinus.com", ExpressionUtils.executeTemplateExpression("www.@{domain}.com", env));
    }
}
