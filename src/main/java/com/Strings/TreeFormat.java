package com.Strings;

import java.util.*;

public class TreeFormat {
    public static void main(String[] args) {
        TreeFormat tf = new TreeFormat();
       // Assert.assertEquals(Arrays.asList(new String[]{"Ann", "- Max", "-- Tom", "- Jim"}), tf.getEmployeeLevel("1:Max:4, 4:Ann:0, 2:Jim:4, 3:Tom:1"));
       // Assert.assertEquals(Arrays.asList(new String[]{"Ann", "- Alb", "- Edmond", "-- Max", "Bruce"}), tf.getEmployeeLevel("1:Max:4, 2:Ann:0, 3:Alb:2, 4:Edmond:2, 5:Bruce:0"));
    }

    private List<String> getEmployeeLevel(String s) {
        String[] arr = s.split(", ");
        List<String> res = new ArrayList<>();
        Map<Integer, String> employeeIdNameMap = new HashMap<>();
        Map<Integer, Set<Integer>> managerEmployeeIdMap = new HashMap<>();
        Set<Integer> rootNodes = new HashSet<>();
        for (String row : arr) {
            String[] details = row.split(":");
            Integer employeeId = Integer.parseInt(details[0]);
            String employeeName = details[1];
            Integer managerId = Integer.parseInt(details[2]);
            employeeIdNameMap.put(employeeId, employeeName);
            if (!managerEmployeeIdMap.containsKey(managerId)) {
                managerEmployeeIdMap.put(managerId, new HashSet<>());
            }
            managerEmployeeIdMap.get(managerId).add(employeeId);
            if (managerId == 0) {
                rootNodes.add(employeeId);
            }
        }
        System.out.println("employeeIdNameMap:" + employeeIdNameMap);
        System.out.println("managerEmployeeIdMap:" + managerEmployeeIdMap);
        System.out.println("rootNodes:" + rootNodes);
        for (Integer start : rootNodes) {
            dfs(managerEmployeeIdMap, employeeIdNameMap, res, "", start);
        }
        for (String s1 : res) {
            System.out.println(s1);
        }
        return res;
    }

    private static void dfs(Map<Integer, Set<Integer>> managerEmployeeIdMap, Map<Integer, String> employeeIdNameMap, List<String> res, String prefix, int cur) {
        if (employeeIdNameMap.containsKey(cur)) {
            if (prefix.equals("")) {
                res.add((prefix + employeeIdNameMap.get(cur)));
            } else {
                res.add((prefix + " " + employeeIdNameMap.get(cur)));
            }
        }
        if (managerEmployeeIdMap.containsKey(cur)) {
            for (int nei : managerEmployeeIdMap.get(cur)) {
                dfs(managerEmployeeIdMap, employeeIdNameMap, res, "-" + prefix, nei);
            }
        }
    }
}
