package programmers.chapter3.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class 교점에별만들기 {
    // 좌표를 나타내는 클래스
    public static class Point{
        public final long x, y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;                
        }
    }  
    
    // 교점의 좌표값 구하는 함수
    public static Point intersection(long a1, long a2, long b1, long b2, long c1, long c2) {
    	
    	double x = (double) (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
    	double y = (double) (a2*c1 - a1*c2)/(a1*b2 - a2*b1);
    	
    	// x, y가 정수인지 확인
    	if(x % 1 != 0 || y % 1 != 0) return null;
    	
    	return new Point((long) x, (long) y);
    }
    
    
    // 최댓값을알아내는 함수
    public static Point MaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }

        return new Point(x, y);
    }
    
    
  // 최솟값을 알아내는 함수
    public static Point MinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }

        return new Point(x, y);
    }
    
    
    
    public static String[] solution(int[][] line) {
    	List<Point> points = new ArrayList<>();
    	
        // 직선의 교점
        for(int i=0; i<line.length; i++){
            for(int j=i+1; j<line.length; j++){
            	Point p = intersection(line[i][0], line[j][0], 
	            			line[i][1], line[j][1], 
	            			line[i][2], line[j][2]);
            	if(p != null) points.add(p);
            }
        }
        
        Point maxPoint = MaxPoint(points);
        Point minPoint = MinPoint(points);
        
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);
        
        char[][] arr = new char[height][width];
        for (char[] row: arr) {
        	Arrays.fill(row, '.');
        }
        
        for (Point p : points) {
            int x = (int) (p.x - minPoint.x);
            int y = (int) (maxPoint.y - p.y);
        	arr[y][x] = '*';
        }
        
        String[] result = new String[arr.length];
        for (int i=0; i<result.length; i++){
            result[i] = new String(arr[i]);
        }

        return result;
	}
    
    public static void main(String[] args) {
    	int[][] arr = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};

    	String[] ss = solution(arr);
    	for (String s: ss) {
    		System.out.println(s);
    	}
    	
	}
}