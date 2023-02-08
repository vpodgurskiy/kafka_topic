import { NgModule } from '@angular/core';
import { MatTableModule } from '@angular/material/table';
import { MatButtonModule } from "@angular/material/button";
import { MatToolbarModule} from "@angular/material/toolbar";
import {MatTooltipModule} from "@angular/material/tooltip";
import {MatIconModule} from "@angular/material/icon";
import {MatDialogModule} from "@angular/material/dialog";
import {MatListModule} from "@angular/material/list";
import {MatOptionModule} from "@angular/material/core";
import {MatSelectModule} from "@angular/material/select";

const modules = [
  MatTableModule,
  MatButtonModule,
  MatToolbarModule,
  MatTooltipModule,
  MatIconModule,
  MatDialogModule,
  MatListModule,
  MatOptionModule,
  MatSelectModule
]

@NgModule({
  declarations: [],
  imports: modules,
  exports: modules,
})
export class MaterialModule {}
