interface can have private , static and default methods

            package test;

            interface Camera{
              default void reset() {
                helper();
              }
              private void helper() {
                System.out.println("reset camera");
              }	
              public static void info(Camera cam) {
                System.out.println("details of camera : "+ cam.toString());
              }
            }

            class Canon implements Camera{
              @Override
              public String toString() {
                // TODO Auto-generated method stub
                return "canon company";
              }
            }

            public class TestCF {
              public static void main(String[] args)throws Exception{
                Camera cam = new Canon();
                cam.reset();
                Camera.info(cam);
              }

            }
