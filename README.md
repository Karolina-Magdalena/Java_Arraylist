# Java_Arraylist

Declaring matrix:

ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();

Declaring rows:

int n = scan.nextInt();
        for (int i=0;i<n;i++) {
            arr.add(new ArrayList<Integer>());
        }

Declaring columns:


for (int i=0;i<n;i++) {
            int d = scan.nextInt();
            for (int j=0;j<d;j++){
                int num = scan.nextInt();
                arr.get(i).add(num);
            }

        }

Printing element of matrix:

System.out.println(arr.get(x-1).get(y-1));


Try .... Catch:

	    try {
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }

