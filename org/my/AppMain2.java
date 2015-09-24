package org.my;

class AppMain2
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++) {
            final String arg = args[i];
            Thread thread = new Thread(arg) {
                public void run() {
                    System.out.println(arg);
                }
            };
            thread.start();
            try {
                thread.join();
            } catch (Exception e){
            }
        }
    }
}