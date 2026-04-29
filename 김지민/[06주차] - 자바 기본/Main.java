interface EncryptionStrategy {
    String encrypt(String plaintext);
    String decrypt(String ciphertext);
}
class MD5Encryption implements EncryptionStrategy {
    @Override
    public String encrypt(String plaintext) {}
    @Override
    public String decrypt(String ciphertext) {}
}

class SHA256Encryption implements EncryptionStrategy {
    @Override
    public String encrypt(String plaintext) {}
    @Override
    public String decrypt(String ciphertext) {}
}

class EncryptionService {
    private final EncryptionStrategy strategy;

    public EncryptionService(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String seal(String plain) {
        return strategy.encrypt(plain);
    }

    public String reveal(String cipher) {
        return strategy.decrypt(cipher);
    }
}
public class Main {
    public static void main(String[] args) {
        EncryptionStrategy md5 = new MD5Encryption ();
        EncryptionService svc = new EncryptionService(md5);

        String cipher = svc.seal("secret data");
        System.out.println(cipher); // MD5(secret data)
        String plain = svc.reveal(cipher);
        System.out.println(plain); // secret data

        // 다른 구현으로 교체해도 클라이언트 코드 변경 없이 동작
        EncryptionStrategy SHA256 = new SHA256Encryption();
        EncryptionService svc2 = new EncryptionService(SHA256);
        String cipher2 = svc2.seal("confidential");
        System.out.println(cipher2);
    }
}

