class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long)length * width * height;
        long bulky = 0L;
        long heavy = 0L;
        if(vol>=Math.pow(10,9) || length>=Math.pow(10,4) || width>=Math.pow(10,4) || height>=Math.pow(10,4))bulky = vol;
        if(mass>=100)heavy = mass;
        if(heavy==mass && bulky==vol)return "Both";
        else if(heavy!=mass && bulky==vol)return "Bulky";
        else if(heavy==mass && bulky!=vol)return "Heavy";
        else return "Neither";
    }
}