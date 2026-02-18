# OrderFlow
OrderFlow es una aplicación web para la gestión eficiente de pedidos, clientes, productos y empleados. Desarrollada con Spring Boot en el backend y React + Vite en el frontend, ofrece una interfaz moderna y fácil de usar.

## 🛠️ Tecnologías

### 🔹 Backend

- Java 17
- Spring Boot
- Spring Data JPA / Hibernate
- Lombok
- MapStruct
- PostgreSQL
- Maven

### 🔹 Frontend

- React 18
- CSS Modules / Tailwind CSS

---

## 📦 Estructura del Proyecto

```
OrderFlow/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/orderflow/
│   │   │   │   ├── controller/
│   │   │   │   ├── service/
│   │   │   │   ├── repository/
│   │   │   │   ├── entity/
│   │   │   │   ├── dto/
│   │   │   │   └── mapper/
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.yml
│   │   │
│   │   └── test/
│   │       └── java/
│   │
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   ├── context/
│   │   └── styles/
│   │
│   └── package.json
│
└── README.md
```

## 📡 Endpoints de la API

### 🔹 Cliente

**Base URL:** `/cliente`

| Método | Endpoint | Descripción | Código de Respuesta |
|--------|----------|------------|---------------------|
| GET | `/cliente/all` | Obtener todos los clientes | 200 OK |
| GET | `/cliente/{id}` | Obtener cliente por ID (UUID) | 200 OK |
| POST | `/cliente/create` | Crear un nuevo cliente | 201 CREATED |
| PUT | `/cliente/{id}` | Actualizar cliente existente | 200 OK |
| DELETE | `/cliente/{id}` | Eliminar cliente | 204 NO CONTENT |
