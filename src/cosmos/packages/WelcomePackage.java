/*
 * OpenMuOnline - a open source mu online server
 * Copyright (C) 2009 Mark Schmale
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cosmos.packages;

/**
 *
 * @author masch
 */
public class WelcomePackage extends MessageTypeC1 {

    public WelcomePackage()
    {
        super();
        this.setAction((byte)0, (byte)1);
    }
}
