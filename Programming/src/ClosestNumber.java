public class ClosestNumber {
	int start,end;
	int BinarySearch(int[] numbers, int start, int end, int key){
		System.out.println(start + " , " + end);
		int position = (start+end)/2;
		if(start+1 < end){
			if(numbers[position] == key)
				return position;
			else if(numbers[position]>key)
				return BinarySearch(numbers,start, position, key);
			else if(numbers[position]<key)
				return BinarySearch(numbers,position+1, end, key);
		}
		this.start = start;
		this.end = end;
		return -1;
	}
    int closestNumber(int[] numbers, int key){
    	int temp= BinarySearch(numbers,0,numbers.length-1,key) ;
    	if(temp < 0){
    		System.out.println(this.start + " " + this.end);
    		if(key<numbers[this.start])
    			return this.start;
    		else if(key>numbers[this.end])
    			return this.end;
    		else
    			if((Math.abs(key-numbers[this.start])-Math.abs(key-numbers[this.end])) >0)
    				return this.end;
    			else
    				return this.start;
    	}
    	else
    		return temp;
    }
}
