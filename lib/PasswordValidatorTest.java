package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Empty password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: ไม่มีรหัสผ่านควรจะ INVALID
        PasswordStrength result2 = PasswordValidator.validate("123");
        if (result2 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got "+ result2);
        }

        // Test Case 3: รหัสผ่านตัวเลขย่างเดียวควร WEAK
        PasswordStrength result3 = PasswordValidator.validate("12345678910");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 Passe: Number password is WEAK ");
        } else {
            System.out.println("Test Case 3 FAILED: Expected WEAK but got "+ result3);
        }
        // Test Case 4: All Lower Case
        PasswordStrength result4 = PasswordValidator.validate("abcdefghijk");
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 Passe: Lower password is WEAK ");
        } else {
            System.out.println("Test Case 4 FAILED: Expected WEAK but got "+ result4);
        }
        // Test Case 5: Any UpperCase
        PasswordStrength result5 = PasswordValidator.validate("Acdefghijk");
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 Passe: Lower password is MEDIUM ");
        } else {
            System.out.println("Test Case 5 FAILED: Expected MEDIUM but got "+ result5);
        }
        // Test Case 6: มีเลข ตัวอักษร
        PasswordStrength result6 = PasswordValidator.validate("asdsdsdsdw7894");
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 Passe:มีเลขตัวอักษร password is MEDIUM ");
        } else {
            System.out.println("Test Case 5 FAILED: Expected MEDIUM but got "+ result6);
        }
        // Test Case 7: รหัสผ่านมีทุกอย่าง
        PasswordStrength result7 = PasswordValidator.validate("Theamzaza_123456@");
            if (result6 == PasswordStrength.STRONG) {
                System.out.println("Test Case 7 Passe: All element is STRONG");
            } else {
                System.out.println("Test Case 7 FAILED: Expexted STRONG but got "+result7);
            }


            System.out.println("--------------------------------");
    }
}