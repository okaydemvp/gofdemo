package com.okayde.gof.mediator.demo2;

import java.util.ArrayList;
import java.util.Collection;

public class DepUserMediatorImpl {
    private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();

    private DepUserMediatorImpl() {
        initTestData();
    }

    public static DepUserMediatorImpl getInstance() {
        return mediator;
    }

    private Collection<DepUserModel> depUserModels = new ArrayList<DepUserModel>();

    private void initTestData() {
        DepUserModel model1 = new DepUserModel();
        model1.setDepUserId("model1");
        model1.setDepId("d1");
        model1.setUserId("u1");
        depUserModels.add(model1);

        DepUserModel model2 = new DepUserModel();
        model2.setDepUserId("model2");
        model2.setDepId("d2");
        model2.setUserId("u2");
        depUserModels.add(model2);
    }

    public boolean deleteDep(String depId) {
        Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
        for (DepUserModel du : depUserModels) {
            if (du.getDepId().equals(depId)) {
                tempCol.add(du);
            }
        }
        depUserModels.removeAll(tempCol);
        return true;
    }

    public void showDepUsers(Dep dep) {
        for (DepUserModel du : depUserModels) {
            if (du.getDepId().equals(dep.getDepId())) {
                System.out.println("showDepUsers");
            }
        }
    }

    public void showUserDeps(User user) {
        for (DepUserModel du : depUserModels) {
            if (du.getDepUserId().equals(user.getUserId())) {
                System.out.println("showUserDeps");
            }
        }
    }

    public boolean changeDep(String userId, String oldDep, String newDep) {
        return false;
    }

    public boolean joinDep(Collection<String> colDepIds, Dep newDep) {
        return false;
    }
}
