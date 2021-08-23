
package grade;


public class TestGrade {
       public static void main(String[] args) {
        Grade grade = new Grade();
        grade.disciplinas[0] = new Disciplina(07.00,10.00,150,"illio","segunda-feira");
        grade.disciplinas[1] = new Disciplina(07.00,10.00,208,"Gustavo","terça-feira");
        grade.disciplinas[2] = new Disciplina(07.00,10.00,120,"José Alexandre","quarta-feira");
        grade.disciplinas[3] = new Disciplina(07.00,10.00,115,"George","quinta-feira");
        grade.disciplinas[4] = new Disciplina(07.00,10.00,177,"illio","sexta-feira");
        Grade semestre = new Grade();
        Grade curso = new Grade();
        semestre.semestre = 6;
        curso.curso = "ciências da computação";
        
           System.out.print(semestre.semestre  +  curso.curso  +  grade.disciplinas[0]);
           System.out.println(semestre.semestre + curso.curso + grade.disciplinas[1]);
           System.out.println(semestre.semestre + curso.curso + grade.disciplinas[2]);
           System.out.println(semestre.semestre + curso.curso + grade.disciplinas[3]);
           System.out.println(semestre.semestre + curso.curso + grade.disciplinas[4]);
        
       
        
    }
}
