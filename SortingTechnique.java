package package1;
//This class provides sorting mechanisms to sort the various shapes , based on their 
//surface areas. 
public class SortingTechnique {
	//This method performs the selection sort to sort the given array of shapes on the
	//basis of their surface areas.
	public static void selectionSort(Shape[] shapes) {
		int min;
		for(int i=0;i<shapes.length;i++) {
			min=i;	//	Select the ith index as min element initially.
			//This loop figures out the index of the element with lowest surface area
			//in the array.
			for(int j=i+1;j<shapes.length;j++) {
				if(shapes[j].compareTo(shapes[min])<0) {
					min=j;
				}
			}
			//Swap the ith element with the min index element.
			Shape temp=shapes[i];
			shapes[i]=shapes[min];
			shapes[min]=temp;			
		}
	}
}
