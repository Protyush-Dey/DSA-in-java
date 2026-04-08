class Robot {

    private int width;
    private int height;
    private int p;
    private int total;
    public Robot(int width, int height) {
       this.width = width;
       this.height = height;
       p = 2*(width+height-2);
       total = 0;
        
    }
    
    public void step(int num) {
        total = (total+num)%p;
        if (total == 0 && num > 0) {
        total = p;  
    }
    }
    
    public int[] getPos() {
        int pos = total;
        // int w = width;
        // int h = height
        if(pos<width) return new int[]{pos,0};
        pos=pos-(width-1);
        if(pos<height) return new int[]{width-1,pos};
        pos= pos-(height-1);
        if (pos < width) return new int[]{width - 1 - pos, height - 1};
    pos -= (width - 1);

        return new int[]{0,height - 1 - pos};
    }
    
    public String getDir() {
        int pos = total;
        if (pos == 0) return "East";
        if (pos == p) return "South";
        // int w = width;
        // int h = height
        if(pos<width) return "East";
        pos=pos-(width-1);
        if(pos<height) return "North";
        pos= pos-(height-1);
        if(pos<width) return "West";
        pos= pos-(width-1);
        return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
