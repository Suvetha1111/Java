class ship {
    static int ship(int capacity,int numberofppl) {
      int totrounds=numberofppl/capacity;
      int rem=numberofppl%capacity;
      if(rem!=0)
       return totrounds+1;
      return totrounds;
    }
    public static void main(String args[])
    {
        int capacity=30,numberofppl=75;
        System.out.println(ship(30,75));
    }
}
