package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    public void isPassword() {

        String dbPassword = "pass";
        String password = "pass";

        assertTrue(UserUtils.isPasswordEqual(dbPassword,password));
    }



}
