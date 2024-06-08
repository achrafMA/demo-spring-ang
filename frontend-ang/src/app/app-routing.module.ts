import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "../../../src/app/home/home.component";
import {ProfileComponent} from "../../../src/app/profile/profile.component";
import {LoginComponent} from "../../../src/app/login/login.component";
import {LoadStudentsComponent} from "../../../src/app/load-students/load-students.component";
import {LoadPaymnetsComponent} from "../../../src/app/load-paymnets/load-paymnets.component";
import {DashboardComponent} from "../../../src/app/dashboard/dashboard.component";
import {StudentsComponent} from "../../../src/app/students/students.component";

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"profile",component:ProfileComponent},
  {path:"login",component:LoginComponent},
  {path:"loadStudents",component:LoadStudentsComponent},
  {path:"loadPayments",component:LoadPaymnetsComponent},
  {path:"dashboard",component:DashboardComponent},
  {path:"students",component:StudentsComponent},
  //{path:"payments",component:PaymnetsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
