package src_5weeks;

public class classDef {

    static class Movie {
        String movieName ;
        String director ;
        int runtime ;

        public Movie(String movieName, String director) {
//            System.out.println("Movie 객체가 생성되었습니다.");
            System.out.println("movie, director를 매개 변수로 받는 객체가 생성 되었습니다.");
            this.movieName = movieName;
            this.director = director;
        }
        public Movie(int k){
            System.out.println("runtime만을 매개 변수로 받는 객체가 생성 되었습니다.");
            runtime = k;
        }


        public void movie_info() {
            System.out.println(movieName);
            System.out.println(director);
        }
    }

    public static void main(String[] args) {
//        Movie a = new Movie("Harrtypotter","allen",120);
//        System.out.println(a.movieName);
//        a.movie_info();
        Movie b = new Movie("설국 열차", "봉준호");
//        b.movie_info();
        Movie c = new Movie(120);
    }
}
