package proyecto_final;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import proyecto_final.data_access.DataAccessManager;
import proyecto_final.objects.Ability;
import proyecto_final.objects.Pokemon;

public class AccesApp {

    private static final Scanner SCANNER = new Scanner(System.in);

    private enum MenuOption {
        QUERY_POKEMONS, QUERY_POKEMONS_BY_NAME, QUERY_ABILITIES, INSERT_ABILITY, DELETE_ABILITY, BYE
    }

    public static void main(String[] args) {

        MenuOption opcionElegida = null;

        try (DataAccessManager dam = DataAccessManager.getInstance()) {
            do {
                printOptions();
                opcionElegida = readChoice();

                switch (opcionElegida) {
                    case QUERY_POKEMONS:
                        loadAllPokemons(dam);
                        break;
                    case QUERY_POKEMONS_BY_NAME:
                        searchPokemonByName(dam);
                        break;
                    case QUERY_ABILITIES:
                        loadAllAbilities(dam);
                        break;
                    case INSERT_ABILITY:
                        insertAbility(dam);
                        break;
                    case DELETE_ABILITY:
                    case BYE:

                }
            } while (opcionElegida != MenuOption.BYE);
        } catch (SQLException ex) {
            System.out.println("Error de acceso a datos: " + ex.getMessage());
        }

        System.out.println("\n\nBye!\n\n");
        SCANNER.close();
    }

    private static void printOptions() {
        StringBuilder sb = new StringBuilder()
                .append("\n\n\nElija una opción:\n")
                .append("\t1)Consultar todos los pokemons\n")
                .append("\t2)Consultar los pokemons filtradas por LIKE\n")
                .append("\t3)Consultar todas las abilidades\n")
                .append("\t4)Añadir una abilidad nueva\n")
                .append("\t5)Eliminar una abilidad\n")
                .append("\t6)Salir\n")
                .append("Opción: ");
        System.out.print(sb.toString());
}

    private static MenuOption readChoice() {
        try {
            int choiceInt = Integer.parseInt(SCANNER.nextLine());
            return MenuOption.values()[choiceInt - 1];
        } catch (RuntimeException re) {
            System.out.println("Opción inválida... Inténtelo otra vez.");
            return readChoice();
        }
    }

    private static void loadAllPokemons(DataAccessManager dam) throws SQLException {
        List<Pokemon> allPokemons = dam.loadAllPokemon();
        printPokemons(allPokemons);
    }

    private static void searchPokemonByName(DataAccessManager dam) throws SQLException {
        String name = requestPokemonNameLike();
        List<Pokemon> pokemonFilterdByName = dam.loadPokemonContaining(name);
        printPokemons(pokemonFilterdByName);
    }

    private static void loadAllAbilities(DataAccessManager dam) throws SQLException {
        List<Ability> allAbilities = dam.loadAllAbiliteis();
        printAbilities(allAbilities);

    }

    private static void insertAbility(DataAccessManager dam) throws SQLException {
        String nameAbil = insertAbilityName();
        List<Ability> insertAbility = dam.insertAbilities(nameAbil);

        printAbilities(insertAbility);
    }

    private static void printPokemons(List<Pokemon> pokemons) {
        if (pokemons == null || pokemons.isEmpty()) {
            System.out.println("No hay registros...");
            return;
        }

        for (Pokemon pokemon : pokemons) {
            System.out.println("\t" + pokemon);
        }
        System.out.println();
    }

    private static void printAbilities(List<Ability> abilities) {
        if (abilities == null || abilities.isEmpty()) {
            System.out.println("No hay registros...");
            return;
        }

        for (Ability ability : abilities) {
            System.out.println("\t" + ability);
        }
        System.out.println();
    }

    private static String readNotEmptyString() {
        String input = null;
        //prevenir texto vacío
        while (input == null || input.length() == 0) {
            input = SCANNER.nextLine();
            if (input.length() == 0) {
                System.out.println("escriba algo...");
            }
        }
        return input;
    }

    private static String requestPokemonNameLike() {
        System.out.print("Escriba un nombre a filtrar (recuerde indicar con el caracter % el filtro de búsqueda): ");
        return readNotEmptyString();

    }

    private static String insertAbilityName() {
        System.out.print("Escribe el nombre de la nueva abilidad: ");
        return readNotEmptyString();

    }
}
