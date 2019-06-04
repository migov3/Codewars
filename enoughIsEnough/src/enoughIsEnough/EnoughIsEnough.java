package enoughIsEnough;

import java.util.Arrays;

public class EnoughIsEnough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = EnoughIsEnough.deleteNth(new int[] {1,2,3,4,1,2,3 }, 1 );
		System.out.println(Arrays.toString(res));
	}

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		//Code here ;)
		int x = 0, occurrences=0, aux;
		
		while(maxOccurrences!=0 && x<elements.length) { 						//recorre todos los elementos del array
			aux = elements[x];
			for(int i = 0; i<elements.length;i++) {     //recorre el array buscando ocurrencias
				if(elements[i]==aux) {     				//el numero actual esta en el array
					occurrences++;
					if(occurrences>maxOccurrences) {     //si el numero de ocurrencias excede el limite
						for(int j=i; j<elements.length-1;j++) { //reordena el array moviendo hacia la derecha el numero repetido
							int aux1 = elements[j+1];
							int aux2 = elements[j];
							elements[j] = aux1;
							elements[j+1] = aux2;
						}
						elements = Arrays.copyOf(elements, elements.length-1);
					}
				}
			}
			
			occurrences=0;
			x++;
		}
		if(maxOccurrences==0) elements = new int[] {};
		return elements;
	}

}
