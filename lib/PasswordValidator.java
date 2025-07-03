package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return ระดับความปลอดภัยของรหัสผ่าน
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if (password.length() <= minLength || password.isEmpty()) {
            return PasswordStrength.INVALID;
        }

        boolean UpperCase = false;
        boolean Lowercase = false;
        boolean Special = false;
        boolean Digit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                UpperCase = true;
            }else if (Character.isLowerCase(c)) {
                Lowercase = true;
            }else if (Character.isDigit(c)) {
                Digit = true;
            }else
             Special = true;
                
            
        }

        int passwordstg = 0;
        if (password.length() >= minLength) {passwordstg++;}
        if (Digit) {passwordstg++;}
        if (UpperCase) {passwordstg++;}
        if (Lowercase) {passwordstg++;}
        if (Special) {passwordstg++;}

        if (passwordstg >= 4 ) {
            return PasswordStrength.STRONG;
        }else if (passwordstg >= 3) {
            return PasswordStrength.MEDIUM;
        }else if (passwordstg >= 2) {
            return PasswordStrength.WEAK;
        }else{
            return PasswordStrength.INVALID;
        }
            
        
        
        




    
    }
}