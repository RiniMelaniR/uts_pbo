/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Rini Melani R
 * Kelas TI20E
 * Nim 20200040071
 */
public class Motor {
    String meerek;
    String jenis;
    int harga;
    int status;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motorku=new Motor();
        Motor motormu=new Motor();  
        motorku.setDataMotor("Honda","Revo",20000000);
        motormu.setDataMotor("Suzuki","shougn",1000000);
       
        motorku.viewDataMotor();
        motorku.nyalakan();
        System.out.println("==================");
        motormu.viewDataMotor();
        motormu.nyalakan();
    }
    public void viewDataMotor (){
        System.out.println("Merk :"+getmerk());
        System.out.println("Merk :"+getjeni());
        System.out.println("Merk :"+gethargi());
        System.out.println("Status :"+getstatus());
    }
    public void nyalakan(){
        if (status==0){
            status = 1;
            System.out.println("Motor berhasil menyala");
        }else{
            System.out.println("Motor SUdah Menyala");
        }
    }
    public void matikan(){
        if(status==1){
            status=0;
            System.out.println("Motor dimatikan");
        }else{
            System.out.println("Motor Sudah dimatikan");
        }
    }
    public void setDataMotor (String merk, String jenis, int hargi){
        meerek=merk;
        this.jenis=jenis;
        harga=hargi;
        status = 0;
    }
    public int getstatus(){
        nyalakan();
        return status;
    }
    public String getmerk(){
        return meerek;
    }
    public String getjeni(){
        return jenis;
    }
    public int gethargi(){
        return harga;
    }
}