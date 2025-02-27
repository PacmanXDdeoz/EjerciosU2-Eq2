class Perro {
    Perro() {
    }
    String nombre;
    int id;
    String enfermedad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", id=" + id + ", enfermedad=" + enfermedad + "]";
    }
}
