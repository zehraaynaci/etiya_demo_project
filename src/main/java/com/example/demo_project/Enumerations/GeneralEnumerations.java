package com.example.demo_project.Enumerations;

public class GeneralEnumerations {

    public enum ReturnCode {
        SUCCESS("200"),
        ERROR("500");

        private String returnCode;

        ReturnCode(String returnCode) {
            this.returnCode = returnCode;
        }

        public String getReturnCode() {
            return returnCode;
        }

        public void setReturnCode(String returnCode) {
            this.returnCode = returnCode;
        }
    }
}
