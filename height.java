static int B, H;

static boolean flag = true;

static {

 Scanner sc = new Scanner(System.in);

 B = sc.nextInt();

 H = sc.nextInt();

 sc.close();

 try {

  if (B <= 0 || H <= 0)

   throw new Exception("Breadth and height must be positive");

 } catch (Exception e) {

  System.out.println(e);

  System.exit(0);

 }

}
