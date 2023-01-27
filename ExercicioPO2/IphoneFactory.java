package ExercicioPO2;

import java.util.Scanner;

public class IphoneFactory {


    public class iphoneFactory implements Iphone {

        public iphoneFactory(String sistemaOperacional, String memoriaRam, String memoriaRom, String tela, String chip, String camera) {
            String sistemaOperacional1 = this.sistemaOperacional;
            String memoriaRam1 = this.memoriaRam;
            String memoriaRom1 = this.memoriaRom;
            String tela01 = this.tela;
            String chip1 = this.chip;
            String camera01 = this.camera;


        }


        public String toString() {
            return "iphoneFactory{" +
                    "sistemaOperacional='" + sistemaOperacional + '\'' +
                    ", memoriaRam='" + memoriaRam + '\'' +
                    ", memoriaRom='" + memoriaRom + '\'' +
                    ", tela='" + tela + '\'' +
                    ", chip='" + chip + '\'' +
                    ", camera='" + camera + '\'' +
                    '}';
        }

        @Override
        public void exibirDetalhes() {

        }
        private String sistemaOperacional;
        private String memoriaRam;
        private String memoriaRom;
        private String tela;
        private String chip;
        private String camera;

        public String getSistemaOperacional() {
            return sistemaOperacional;
        }

        public void setSistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
        }

        public String getMemoriaRam() {
            return memoriaRam;
        }

        public void setMemoriaRam(String memoriaRam) {
            this.memoriaRam = memoriaRam;
        }

        public String getMemoriaRom() {
            return memoriaRom;
        }

        public void setMemoriaRom(String memoriaRom) {
            this.memoriaRom = memoriaRom;
        }

        public String getTela() {
            return tela;
        }

        public void setTela(String tela) {
            this.tela = tela;
        }

        public String getChip() {
            return chip;
        }

        public void setChip(String chip) {
            this.chip = chip;
        }

        public String getCamera() {
            return camera;
        }

        public void setCamera(String camera) {
            this.camera = camera;
        }

        }
        public static void imprimirMenu() {
            System.out.println("----- Bem vindo a Fábrica de Iphones -----");
            System.out.println("----- MENU -----");
            System.out.println(" 1 - Iphone_x");
            System.out.println(" 2 - Iphone_9");
            System.out.println(" 3 - Iphone_13_mini");
            System.out.println(" Digite a opção desejada: ");

        }

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            imprimirMenu();
            typeIphone tipo = typeIphone.IPHONE_13_MINI;
            switch (tipo){
                case IPHONE_9 -> new iphoneFactory ("IOS16", "6GB", "64GB", "6.1", "A14","12MP");



                case IPHONE_X -> new iphoneFactory("IOS15", "4GB", "32GB","6.1","A16","10MP");


                case IPHONE_13_MINI -> new iphoneFactory("IOS17","12GB","128GB","6.1","A17","15MP");

            }


        }
    }

