/*a
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/** ouput for loop s= =9./
 *
 * @author student
 */
public class IntersessionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 2, 3, 4, 5};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        for (int num : arr){
            System.out.println(num);
        }
        
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i<arr.length);
        
        int j= 0;
        while (j<arr.length){
            System.out.println(arr[j]);
            j++;
        }
    }
}
