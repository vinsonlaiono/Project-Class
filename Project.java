class Project {
    private String name;
    private String description;

    // Initialize empty project
    public Project(){
    }
    // Initialize with project name
    public Project (String name) {
        name = name;
    }
    // Initialize with project name and description
    public Project (String name, String description) {
        this.name = name;
        this.description = description;
    }
    //------------------------------------------------
    // Setter project name
    public void setName (String name) {
        this.name = name;
    }
    // Setter for project description
    public void setDescription (String description) {
        this.description = description;
    }
    //------------------------------------------------
    // Getter for project name
    public String getName (){
        System.out.println("Project name: " + name);
        return "Project name: " + name;
    }
    // Getter for project description
    public String getDescription (){
        System.out.println("Project Description: "+ description);
        return "Project Description: "+ description;
    }
    // Getter for project information
    public String getProject () {
        System.out.println("Project Name: " + name + ", Description: " + description);
        return "Project Name: " + name + ", Description: " + description;
    }
}