package com.event.management.model;

public class Auth {

    // ======= User model =======
    public static class User {
        private Long id;
        private String fullName;
        private String email;
        private String password;
        private String role;
        private String phone;
        private String city;

        // Getters & Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getFullName() { return fullName; }
        public void setFullName(String fullName) { this.fullName = fullName; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
    }

    // ======= LoginRequest =======
    public static class LoginRequest {
        private String email;
        private String password;

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }

    // ======= RegisterRequest =======
    public static class RegisterRequest {
        private String fullName;
        private String email;
        private String password;
        private String role;
        private String phone;
        private String city;

        public String getFullName() { return fullName; }
        public void setFullName(String fullName) { this.fullName = fullName; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
    }

    // ======= LoginResponse =======
    public static class LoginResponse {
        private String email;
        private String role;
        private String token;

        public LoginResponse(String email, String role, String token) {
            this.email = email;
            this.role = role;
            this.token = token;
        }

        public String getEmail() { return email; }
        public String getRole() { return role; }
        public String getToken() { return token; }
    }
}
