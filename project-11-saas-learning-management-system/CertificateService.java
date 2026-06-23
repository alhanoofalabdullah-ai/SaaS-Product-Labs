package src.services;

public class CertificateService {

    private int certificatesIssued = 0;

    public void issueCertificate() {
        certificatesIssued++;
    }

    public int totalCertificates() {
        return certificatesIssued;
    }
}
