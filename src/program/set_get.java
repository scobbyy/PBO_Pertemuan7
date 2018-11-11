package program;

public class set_get {

    protected String nim;
    protected String nama;
    protected float ipk;
    private Object opt;

    public set_get(String nim,String nama,float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;   
    }
    
   
    public void getNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim; 
    }
    
    public void getNim(String nim) {
        this.nim = nim;
    }

    
}
 

