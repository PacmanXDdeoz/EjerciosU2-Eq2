// //Hay vacantes de 5 trabajadores en la policía, no puede haber mas, pero hay que registrar a cada uno con: 
// Nombre, Apellido, correo, teléfono y Numero de placas. *Debe ser recursivo*. El objeto será: Policía y el Main: Comisaria.
class Policia{
    int id;
    String nombre;
    String apellido;
    String correo;
    long cel;
    String placas;
Policia(){}

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public String getCorreo() {
    return correo;
}
public void setCorreo(String correo) {
    this.correo = correo;
}
public long getCel() {
    return cel;
}
public void setCel(long cel) {
    this.cel = cel;
}
public String getPlacas() {
    return placas;
}
public void setPlacas(String placas) {
    this.placas = placas;
}

@Override
public String toString() {
    return "Policia [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", cel=" + cel
            + ", placas=" + placas + "]";
}
}
