public class ProjectTest {
    public static void main (String[] args) {
        Project project1 = new Project("Facebook");
        Project project2 = new Project("Facebook", "Create a better facebook!");

        project1.setDescription("This is the description of the project!");
        project1.setName("New Project");

        project1.getProject();
        project2.getProject();
    }
}