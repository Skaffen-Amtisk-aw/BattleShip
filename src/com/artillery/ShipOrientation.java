package com.artillery;

public enum ShipOrientation {

        HORIZONTAL, VERTICAL;

        public String toString() {

            return switch (this) {

                case VERTICAL -> "VERTICAL";
                case HORIZONTAL -> "HORIZONTAL";

//Update to other parts of program required, this is OK
            };
        }

    }
