// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetScenePointRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetScenePointRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetScenePointRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetScenePointRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetScenePointRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016GetScenePointRsp.proto\"\u00ed\u0002\n\u0010GetScenePointRsp\u0012'\n\u001fnot_explored_dungeon_entry_list\u0018y \u0003(\r\u0012(\n to_be_explore_dungeon_entry_list\u0018\u000f \u0003(\r\u0012\u0019\n\u0011locked_point_list\u0018\u0002 \u0003(\r\u0012\u0019\n\u0011unhide_point_list\u0018\u0005 \u0003(\r\u0012\u000f\n\u0007retcode\u0018\t \u0001(\u0005\u0012\u0012\n\nbelong_uid\u0018\u0001 \u0001(\r\u0012\u001b\n\u0013unlocked_point_list\u0018\u0004 \u0003(\r\u0012\u0018\n\u0010unlock_area_list\u0018\u000b \u0003(\r\u0012\u0017\n\u000fhide_point_list\u0018, \u0003(\r\u0012\u0010\n\bscene_id\u0018\u0006 \u0001(\r\u0012'\n\u001fnot_interact_dungeon_entry_list\u00187 \u0003(\r\u0012 \n\u0018group_unlimit_point_list\u00188 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetScenePointRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetScenePointRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetScenePointRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetScenePointRspOuterClass.internal_static_GetScenePointRsp_descriptor, new String[] { "NotExploredDungeonEntryList", "ToBeExploreDungeonEntryList", "LockedPointList", "UnhidePointList", "Retcode", "BelongUid", "UnlockedPointList", "UnlockAreaList", "HidePointList", "SceneId", "NotInteractDungeonEntryList", "GroupUnlimitPointList" });
    }
    
    public static final class GetScenePointRsp extends GeneratedMessageV3 implements GetScenePointRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NOT_EXPLORED_DUNGEON_ENTRY_LIST_FIELD_NUMBER = 121;
        private Internal.IntList notExploredDungeonEntryList_;
        private int notExploredDungeonEntryListMemoizedSerializedSize;
        public static final int TO_BE_EXPLORE_DUNGEON_ENTRY_LIST_FIELD_NUMBER = 15;
        private Internal.IntList toBeExploreDungeonEntryList_;
        private int toBeExploreDungeonEntryListMemoizedSerializedSize;
        public static final int LOCKED_POINT_LIST_FIELD_NUMBER = 2;
        private Internal.IntList lockedPointList_;
        private int lockedPointListMemoizedSerializedSize;
        public static final int UNHIDE_POINT_LIST_FIELD_NUMBER = 5;
        private Internal.IntList unhidePointList_;
        private int unhidePointListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        public static final int BELONG_UID_FIELD_NUMBER = 1;
        private int belongUid_;
        public static final int UNLOCKED_POINT_LIST_FIELD_NUMBER = 4;
        private Internal.IntList unlockedPointList_;
        private int unlockedPointListMemoizedSerializedSize;
        public static final int UNLOCK_AREA_LIST_FIELD_NUMBER = 11;
        private Internal.IntList unlockAreaList_;
        private int unlockAreaListMemoizedSerializedSize;
        public static final int HIDE_POINT_LIST_FIELD_NUMBER = 44;
        private Internal.IntList hidePointList_;
        private int hidePointListMemoizedSerializedSize;
        public static final int SCENE_ID_FIELD_NUMBER = 6;
        private int sceneId_;
        public static final int NOT_INTERACT_DUNGEON_ENTRY_LIST_FIELD_NUMBER = 55;
        private Internal.IntList notInteractDungeonEntryList_;
        private int notInteractDungeonEntryListMemoizedSerializedSize;
        public static final int GROUP_UNLIMIT_POINT_LIST_FIELD_NUMBER = 56;
        private Internal.IntList groupUnlimitPointList_;
        private int groupUnlimitPointListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final GetScenePointRsp DEFAULT_INSTANCE;
        private static final Parser<GetScenePointRsp> PARSER;
        
        private GetScenePointRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.notExploredDungeonEntryListMemoizedSerializedSize = -1;
            this.toBeExploreDungeonEntryListMemoizedSerializedSize = -1;
            this.lockedPointListMemoizedSerializedSize = -1;
            this.unhidePointListMemoizedSerializedSize = -1;
            this.unlockedPointListMemoizedSerializedSize = -1;
            this.unlockAreaListMemoizedSerializedSize = -1;
            this.hidePointListMemoizedSerializedSize = -1;
            this.notInteractDungeonEntryListMemoizedSerializedSize = -1;
            this.groupUnlimitPointListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetScenePointRsp() {
            this.notExploredDungeonEntryListMemoizedSerializedSize = -1;
            this.toBeExploreDungeonEntryListMemoizedSerializedSize = -1;
            this.lockedPointListMemoizedSerializedSize = -1;
            this.unhidePointListMemoizedSerializedSize = -1;
            this.unlockedPointListMemoizedSerializedSize = -1;
            this.unlockAreaListMemoizedSerializedSize = -1;
            this.hidePointListMemoizedSerializedSize = -1;
            this.notInteractDungeonEntryListMemoizedSerializedSize = -1;
            this.groupUnlimitPointListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.notExploredDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
            this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
            this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
            this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
            this.unlockedPointList_ = GeneratedMessageV3.emptyIntList();
            this.unlockAreaList_ = GeneratedMessageV3.emptyIntList();
            this.hidePointList_ = GeneratedMessageV3.emptyIntList();
            this.notInteractDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
            this.groupUnlimitPointList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetScenePointRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetScenePointRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.belongUid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.lockedPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.lockedPointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.lockedPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.lockedPointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.unlockedPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.unlockedPointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x10) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unlockedPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x10;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unlockedPointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.unhidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.unhidePointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x8) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unhidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unhidePointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 48: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.unlockAreaList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.unlockAreaList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x20) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unlockAreaList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x20;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unlockAreaList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 120: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.toBeExploreDungeonEntryList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 122: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.toBeExploreDungeonEntryList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 352: {
                            if ((mutable_bitField0_ & 0x40) == 0x0) {
                                this.hidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x40;
                            }
                            this.hidePointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 354: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x40) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.hidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x40;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.hidePointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 440: {
                            if ((mutable_bitField0_ & 0x80) == 0x0) {
                                this.notInteractDungeonEntryList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x80;
                            }
                            this.notInteractDungeonEntryList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 442: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x80) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.notInteractDungeonEntryList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x80;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.notInteractDungeonEntryList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 448: {
                            if ((mutable_bitField0_ & 0x100) == 0x0) {
                                this.groupUnlimitPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x100;
                            }
                            this.groupUnlimitPointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 450: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x100) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.groupUnlimitPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x100;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.groupUnlimitPointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 968: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.notExploredDungeonEntryList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.notExploredDungeonEntryList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 970: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.notExploredDungeonEntryList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.notExploredDungeonEntryList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.lockedPointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.unlockedPointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.unhidePointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x20) != 0x0) {
                    this.unlockAreaList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.toBeExploreDungeonEntryList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x40) != 0x0) {
                    this.hidePointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x80) != 0x0) {
                    this.notInteractDungeonEntryList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x100) != 0x0) {
                    this.groupUnlimitPointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.notExploredDungeonEntryList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetScenePointRspOuterClass.internal_static_GetScenePointRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetScenePointRspOuterClass.internal_static_GetScenePointRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetScenePointRsp.class, Builder.class);
        }
        
        @Override
        public List<Integer> getNotExploredDungeonEntryListList() {
            return this.notExploredDungeonEntryList_;
        }
        
        @Override
        public int getNotExploredDungeonEntryListCount() {
            return this.notExploredDungeonEntryList_.size();
        }
        
        @Override
        public int getNotExploredDungeonEntryList(final int index) {
            return this.notExploredDungeonEntryList_.getInt(index);
        }
        
        @Override
        public List<Integer> getToBeExploreDungeonEntryListList() {
            return this.toBeExploreDungeonEntryList_;
        }
        
        @Override
        public int getToBeExploreDungeonEntryListCount() {
            return this.toBeExploreDungeonEntryList_.size();
        }
        
        @Override
        public int getToBeExploreDungeonEntryList(final int index) {
            return this.toBeExploreDungeonEntryList_.getInt(index);
        }
        
        @Override
        public List<Integer> getLockedPointListList() {
            return this.lockedPointList_;
        }
        
        @Override
        public int getLockedPointListCount() {
            return this.lockedPointList_.size();
        }
        
        @Override
        public int getLockedPointList(final int index) {
            return this.lockedPointList_.getInt(index);
        }
        
        @Override
        public List<Integer> getUnhidePointListList() {
            return this.unhidePointList_;
        }
        
        @Override
        public int getUnhidePointListCount() {
            return this.unhidePointList_.size();
        }
        
        @Override
        public int getUnhidePointList(final int index) {
            return this.unhidePointList_.getInt(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getBelongUid() {
            return this.belongUid_;
        }
        
        @Override
        public List<Integer> getUnlockedPointListList() {
            return this.unlockedPointList_;
        }
        
        @Override
        public int getUnlockedPointListCount() {
            return this.unlockedPointList_.size();
        }
        
        @Override
        public int getUnlockedPointList(final int index) {
            return this.unlockedPointList_.getInt(index);
        }
        
        @Override
        public List<Integer> getUnlockAreaListList() {
            return this.unlockAreaList_;
        }
        
        @Override
        public int getUnlockAreaListCount() {
            return this.unlockAreaList_.size();
        }
        
        @Override
        public int getUnlockAreaList(final int index) {
            return this.unlockAreaList_.getInt(index);
        }
        
        @Override
        public List<Integer> getHidePointListList() {
            return this.hidePointList_;
        }
        
        @Override
        public int getHidePointListCount() {
            return this.hidePointList_.size();
        }
        
        @Override
        public int getHidePointList(final int index) {
            return this.hidePointList_.getInt(index);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<Integer> getNotInteractDungeonEntryListList() {
            return this.notInteractDungeonEntryList_;
        }
        
        @Override
        public int getNotInteractDungeonEntryListCount() {
            return this.notInteractDungeonEntryList_.size();
        }
        
        @Override
        public int getNotInteractDungeonEntryList(final int index) {
            return this.notInteractDungeonEntryList_.getInt(index);
        }
        
        @Override
        public List<Integer> getGroupUnlimitPointListList() {
            return this.groupUnlimitPointList_;
        }
        
        @Override
        public int getGroupUnlimitPointListCount() {
            return this.groupUnlimitPointList_.size();
        }
        
        @Override
        public int getGroupUnlimitPointList(final int index) {
            return this.groupUnlimitPointList_.getInt(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.belongUid_ != 0) {
                output.writeUInt32(1, this.belongUid_);
            }
            if (this.getLockedPointListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.lockedPointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.lockedPointList_.size(); ++i) {
                output.writeUInt32NoTag(this.lockedPointList_.getInt(i));
            }
            if (this.getUnlockedPointListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.unlockedPointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unlockedPointList_.size(); ++i) {
                output.writeUInt32NoTag(this.unlockedPointList_.getInt(i));
            }
            if (this.getUnhidePointListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.unhidePointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unhidePointList_.size(); ++i) {
                output.writeUInt32NoTag(this.unhidePointList_.getInt(i));
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(6, this.sceneId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(9, this.retcode_);
            }
            if (this.getUnlockAreaListList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.unlockAreaListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unlockAreaList_.size(); ++i) {
                output.writeUInt32NoTag(this.unlockAreaList_.getInt(i));
            }
            if (this.getToBeExploreDungeonEntryListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(this.toBeExploreDungeonEntryListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.toBeExploreDungeonEntryList_.size(); ++i) {
                output.writeUInt32NoTag(this.toBeExploreDungeonEntryList_.getInt(i));
            }
            if (this.getHidePointListList().size() > 0) {
                output.writeUInt32NoTag(354);
                output.writeUInt32NoTag(this.hidePointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.hidePointList_.size(); ++i) {
                output.writeUInt32NoTag(this.hidePointList_.getInt(i));
            }
            if (this.getNotInteractDungeonEntryListList().size() > 0) {
                output.writeUInt32NoTag(442);
                output.writeUInt32NoTag(this.notInteractDungeonEntryListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.notInteractDungeonEntryList_.size(); ++i) {
                output.writeUInt32NoTag(this.notInteractDungeonEntryList_.getInt(i));
            }
            if (this.getGroupUnlimitPointListList().size() > 0) {
                output.writeUInt32NoTag(450);
                output.writeUInt32NoTag(this.groupUnlimitPointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.groupUnlimitPointList_.size(); ++i) {
                output.writeUInt32NoTag(this.groupUnlimitPointList_.getInt(i));
            }
            if (this.getNotExploredDungeonEntryListList().size() > 0) {
                output.writeUInt32NoTag(970);
                output.writeUInt32NoTag(this.notExploredDungeonEntryListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.notExploredDungeonEntryList_.size(); ++i) {
                output.writeUInt32NoTag(this.notExploredDungeonEntryList_.getInt(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.belongUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.belongUid_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.lockedPointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.lockedPointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getLockedPointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.lockedPointListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.unlockedPointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unlockedPointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnlockedPointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unlockedPointListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.unhidePointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unhidePointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnhidePointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unhidePointListMemoizedSerializedSize = dataSize;
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.sceneId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(9, this.retcode_);
            }
            dataSize = 0;
            for (int i = 0; i < this.unlockAreaList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unlockAreaList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnlockAreaListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unlockAreaListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.toBeExploreDungeonEntryList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.toBeExploreDungeonEntryList_.getInt(i));
            }
            size += dataSize;
            if (!this.getToBeExploreDungeonEntryListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.toBeExploreDungeonEntryListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.hidePointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.hidePointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getHidePointListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.hidePointListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.notInteractDungeonEntryList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.notInteractDungeonEntryList_.getInt(i));
            }
            size += dataSize;
            if (!this.getNotInteractDungeonEntryListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.notInteractDungeonEntryListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.groupUnlimitPointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.groupUnlimitPointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getGroupUnlimitPointListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.groupUnlimitPointListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.notExploredDungeonEntryList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.notExploredDungeonEntryList_.getInt(i));
            }
            size += dataSize;
            if (!this.getNotExploredDungeonEntryListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.notExploredDungeonEntryListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetScenePointRsp)) {
                return super.equals(obj);
            }
            final GetScenePointRsp other = (GetScenePointRsp)obj;
            return this.getNotExploredDungeonEntryListList().equals(other.getNotExploredDungeonEntryListList()) && this.getToBeExploreDungeonEntryListList().equals(other.getToBeExploreDungeonEntryListList()) && this.getLockedPointListList().equals(other.getLockedPointListList()) && this.getUnhidePointListList().equals(other.getUnhidePointListList()) && this.getRetcode() == other.getRetcode() && this.getBelongUid() == other.getBelongUid() && this.getUnlockedPointListList().equals(other.getUnlockedPointListList()) && this.getUnlockAreaListList().equals(other.getUnlockAreaListList()) && this.getHidePointListList().equals(other.getHidePointListList()) && this.getSceneId() == other.getSceneId() && this.getNotInteractDungeonEntryListList().equals(other.getNotInteractDungeonEntryListList()) && this.getGroupUnlimitPointListList().equals(other.getGroupUnlimitPointListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getNotExploredDungeonEntryListCount() > 0) {
                hash = 37 * hash + 121;
                hash = 53 * hash + this.getNotExploredDungeonEntryListList().hashCode();
            }
            if (this.getToBeExploreDungeonEntryListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getToBeExploreDungeonEntryListList().hashCode();
            }
            if (this.getLockedPointListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getLockedPointListList().hashCode();
            }
            if (this.getUnhidePointListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getUnhidePointListList().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getBelongUid();
            if (this.getUnlockedPointListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getUnlockedPointListList().hashCode();
            }
            if (this.getUnlockAreaListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getUnlockAreaListList().hashCode();
            }
            if (this.getHidePointListCount() > 0) {
                hash = 37 * hash + 44;
                hash = 53 * hash + this.getHidePointListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSceneId();
            if (this.getNotInteractDungeonEntryListCount() > 0) {
                hash = 37 * hash + 55;
                hash = 53 * hash + this.getNotInteractDungeonEntryListList().hashCode();
            }
            if (this.getGroupUnlimitPointListCount() > 0) {
                hash = 37 * hash + 56;
                hash = 53 * hash + this.getGroupUnlimitPointListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetScenePointRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetScenePointRsp.PARSER.parseFrom(data);
        }
        
        public static GetScenePointRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetScenePointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetScenePointRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetScenePointRsp.PARSER.parseFrom(data);
        }
        
        public static GetScenePointRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetScenePointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetScenePointRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetScenePointRsp.PARSER.parseFrom(data);
        }
        
        public static GetScenePointRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetScenePointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetScenePointRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetScenePointRsp.PARSER, input);
        }
        
        public static GetScenePointRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetScenePointRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetScenePointRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetScenePointRsp.PARSER, input);
        }
        
        public static GetScenePointRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetScenePointRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetScenePointRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetScenePointRsp.PARSER, input);
        }
        
        public static GetScenePointRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetScenePointRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetScenePointRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetScenePointRsp prototype) {
            return GetScenePointRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetScenePointRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetScenePointRsp getDefaultInstance() {
            return GetScenePointRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetScenePointRsp> parser() {
            return GetScenePointRsp.PARSER;
        }
        
        @Override
        public Parser<GetScenePointRsp> getParserForType() {
            return GetScenePointRsp.PARSER;
        }
        
        @Override
        public GetScenePointRsp getDefaultInstanceForType() {
            return GetScenePointRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetScenePointRsp();
            PARSER = new AbstractParser<GetScenePointRsp>() {
                @Override
                public GetScenePointRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetScenePointRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetScenePointRspOrBuilder
        {
            private int bitField0_;
            private Internal.IntList notExploredDungeonEntryList_;
            private Internal.IntList toBeExploreDungeonEntryList_;
            private Internal.IntList lockedPointList_;
            private Internal.IntList unhidePointList_;
            private int retcode_;
            private int belongUid_;
            private Internal.IntList unlockedPointList_;
            private Internal.IntList unlockAreaList_;
            private Internal.IntList hidePointList_;
            private int sceneId_;
            private Internal.IntList notInteractDungeonEntryList_;
            private Internal.IntList groupUnlimitPointList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetScenePointRspOuterClass.internal_static_GetScenePointRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetScenePointRspOuterClass.internal_static_GetScenePointRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetScenePointRsp.class, Builder.class);
            }
            
            private Builder() {
                this.notExploredDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.unlockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.unlockAreaList_ = GeneratedMessageV3.emptyIntList();
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.notInteractDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.groupUnlimitPointList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.notExploredDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.unlockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.unlockAreaList_ = GeneratedMessageV3.emptyIntList();
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.notInteractDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.groupUnlimitPointList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetScenePointRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.notExploredDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.retcode_ = 0;
                this.belongUid_ = 0;
                this.unlockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.unlockAreaList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFDF;
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFBF;
                this.sceneId_ = 0;
                this.notInteractDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFF7F;
                this.groupUnlimitPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFEFF;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetScenePointRspOuterClass.internal_static_GetScenePointRsp_descriptor;
            }
            
            @Override
            public GetScenePointRsp getDefaultInstanceForType() {
                return GetScenePointRsp.getDefaultInstance();
            }
            
            @Override
            public GetScenePointRsp build() {
                final GetScenePointRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetScenePointRsp buildPartial() {
                final GetScenePointRsp result = new GetScenePointRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.notExploredDungeonEntryList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.notExploredDungeonEntryList_ = this.notExploredDungeonEntryList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.toBeExploreDungeonEntryList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.toBeExploreDungeonEntryList_ = this.toBeExploreDungeonEntryList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.lockedPointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.lockedPointList_ = this.lockedPointList_;
                if ((this.bitField0_ & 0x8) != 0x0) {
                    this.unhidePointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.unhidePointList_ = this.unhidePointList_;
                result.retcode_ = this.retcode_;
                result.belongUid_ = this.belongUid_;
                if ((this.bitField0_ & 0x10) != 0x0) {
                    this.unlockedPointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.unlockedPointList_ = this.unlockedPointList_;
                if ((this.bitField0_ & 0x20) != 0x0) {
                    this.unlockAreaList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                result.unlockAreaList_ = this.unlockAreaList_;
                if ((this.bitField0_ & 0x40) != 0x0) {
                    this.hidePointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFBF;
                }
                result.hidePointList_ = this.hidePointList_;
                result.sceneId_ = this.sceneId_;
                if ((this.bitField0_ & 0x80) != 0x0) {
                    this.notInteractDungeonEntryList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFF7F;
                }
                result.notInteractDungeonEntryList_ = this.notInteractDungeonEntryList_;
                if ((this.bitField0_ & 0x100) != 0x0) {
                    this.groupUnlimitPointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFEFF;
                }
                result.groupUnlimitPointList_ = this.groupUnlimitPointList_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof GetScenePointRsp) {
                    return this.mergeFrom((GetScenePointRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetScenePointRsp other) {
                if (other == GetScenePointRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.notExploredDungeonEntryList_.isEmpty()) {
                    if (this.notExploredDungeonEntryList_.isEmpty()) {
                        this.notExploredDungeonEntryList_ = other.notExploredDungeonEntryList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureNotExploredDungeonEntryListIsMutable();
                        this.notExploredDungeonEntryList_.addAll(other.notExploredDungeonEntryList_);
                    }
                    this.onChanged();
                }
                if (!other.toBeExploreDungeonEntryList_.isEmpty()) {
                    if (this.toBeExploreDungeonEntryList_.isEmpty()) {
                        this.toBeExploreDungeonEntryList_ = other.toBeExploreDungeonEntryList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureToBeExploreDungeonEntryListIsMutable();
                        this.toBeExploreDungeonEntryList_.addAll(other.toBeExploreDungeonEntryList_);
                    }
                    this.onChanged();
                }
                if (!other.lockedPointList_.isEmpty()) {
                    if (this.lockedPointList_.isEmpty()) {
                        this.lockedPointList_ = other.lockedPointList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureLockedPointListIsMutable();
                        this.lockedPointList_.addAll(other.lockedPointList_);
                    }
                    this.onChanged();
                }
                if (!other.unhidePointList_.isEmpty()) {
                    if (this.unhidePointList_.isEmpty()) {
                        this.unhidePointList_ = other.unhidePointList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    else {
                        this.ensureUnhidePointListIsMutable();
                        this.unhidePointList_.addAll(other.unhidePointList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getBelongUid() != 0) {
                    this.setBelongUid(other.getBelongUid());
                }
                if (!other.unlockedPointList_.isEmpty()) {
                    if (this.unlockedPointList_.isEmpty()) {
                        this.unlockedPointList_ = other.unlockedPointList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    else {
                        this.ensureUnlockedPointListIsMutable();
                        this.unlockedPointList_.addAll(other.unlockedPointList_);
                    }
                    this.onChanged();
                }
                if (!other.unlockAreaList_.isEmpty()) {
                    if (this.unlockAreaList_.isEmpty()) {
                        this.unlockAreaList_ = other.unlockAreaList_;
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    else {
                        this.ensureUnlockAreaListIsMutable();
                        this.unlockAreaList_.addAll(other.unlockAreaList_);
                    }
                    this.onChanged();
                }
                if (!other.hidePointList_.isEmpty()) {
                    if (this.hidePointList_.isEmpty()) {
                        this.hidePointList_ = other.hidePointList_;
                        this.bitField0_ &= 0xFFFFFFBF;
                    }
                    else {
                        this.ensureHidePointListIsMutable();
                        this.hidePointList_.addAll(other.hidePointList_);
                    }
                    this.onChanged();
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (!other.notInteractDungeonEntryList_.isEmpty()) {
                    if (this.notInteractDungeonEntryList_.isEmpty()) {
                        this.notInteractDungeonEntryList_ = other.notInteractDungeonEntryList_;
                        this.bitField0_ &= 0xFFFFFF7F;
                    }
                    else {
                        this.ensureNotInteractDungeonEntryListIsMutable();
                        this.notInteractDungeonEntryList_.addAll(other.notInteractDungeonEntryList_);
                    }
                    this.onChanged();
                }
                if (!other.groupUnlimitPointList_.isEmpty()) {
                    if (this.groupUnlimitPointList_.isEmpty()) {
                        this.groupUnlimitPointList_ = other.groupUnlimitPointList_;
                        this.bitField0_ &= 0xFFFFFEFF;
                    }
                    else {
                        this.ensureGroupUnlimitPointListIsMutable();
                        this.groupUnlimitPointList_.addAll(other.groupUnlimitPointList_);
                    }
                    this.onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                GetScenePointRsp parsedMessage = null;
                try {
                    parsedMessage = GetScenePointRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetScenePointRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureNotExploredDungeonEntryListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.notExploredDungeonEntryList_ = GeneratedMessageV3.mutableCopy(this.notExploredDungeonEntryList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getNotExploredDungeonEntryListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.notExploredDungeonEntryList_) : this.notExploredDungeonEntryList_;
            }
            
            @Override
            public int getNotExploredDungeonEntryListCount() {
                return this.notExploredDungeonEntryList_.size();
            }
            
            @Override
            public int getNotExploredDungeonEntryList(final int index) {
                return this.notExploredDungeonEntryList_.getInt(index);
            }
            
            public Builder setNotExploredDungeonEntryList(final int index, final int value) {
                this.ensureNotExploredDungeonEntryListIsMutable();
                this.notExploredDungeonEntryList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addNotExploredDungeonEntryList(final int value) {
                this.ensureNotExploredDungeonEntryListIsMutable();
                this.notExploredDungeonEntryList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllNotExploredDungeonEntryList(final Iterable<? extends Integer> values) {
                this.ensureNotExploredDungeonEntryListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.notExploredDungeonEntryList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearNotExploredDungeonEntryList() {
                this.notExploredDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureToBeExploreDungeonEntryListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.mutableCopy(this.toBeExploreDungeonEntryList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getToBeExploreDungeonEntryListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.toBeExploreDungeonEntryList_) : this.toBeExploreDungeonEntryList_;
            }
            
            @Override
            public int getToBeExploreDungeonEntryListCount() {
                return this.toBeExploreDungeonEntryList_.size();
            }
            
            @Override
            public int getToBeExploreDungeonEntryList(final int index) {
                return this.toBeExploreDungeonEntryList_.getInt(index);
            }
            
            public Builder setToBeExploreDungeonEntryList(final int index, final int value) {
                this.ensureToBeExploreDungeonEntryListIsMutable();
                this.toBeExploreDungeonEntryList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addToBeExploreDungeonEntryList(final int value) {
                this.ensureToBeExploreDungeonEntryListIsMutable();
                this.toBeExploreDungeonEntryList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllToBeExploreDungeonEntryList(final Iterable<? extends Integer> values) {
                this.ensureToBeExploreDungeonEntryListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.toBeExploreDungeonEntryList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearToBeExploreDungeonEntryList() {
                this.toBeExploreDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureLockedPointListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.lockedPointList_ = GeneratedMessageV3.mutableCopy(this.lockedPointList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getLockedPointListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.lockedPointList_) : this.lockedPointList_;
            }
            
            @Override
            public int getLockedPointListCount() {
                return this.lockedPointList_.size();
            }
            
            @Override
            public int getLockedPointList(final int index) {
                return this.lockedPointList_.getInt(index);
            }
            
            public Builder setLockedPointList(final int index, final int value) {
                this.ensureLockedPointListIsMutable();
                this.lockedPointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLockedPointList(final int value) {
                this.ensureLockedPointListIsMutable();
                this.lockedPointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLockedPointList(final Iterable<? extends Integer> values) {
                this.ensureLockedPointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.lockedPointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLockedPointList() {
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            private void ensureUnhidePointListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.unhidePointList_ = GeneratedMessageV3.mutableCopy(this.unhidePointList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<Integer> getUnhidePointListList() {
                return ((this.bitField0_ & 0x8) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unhidePointList_) : this.unhidePointList_;
            }
            
            @Override
            public int getUnhidePointListCount() {
                return this.unhidePointList_.size();
            }
            
            @Override
            public int getUnhidePointList(final int index) {
                return this.unhidePointList_.getInt(index);
            }
            
            public Builder setUnhidePointList(final int index, final int value) {
                this.ensureUnhidePointListIsMutable();
                this.unhidePointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnhidePointList(final int value) {
                this.ensureUnhidePointListIsMutable();
                this.unhidePointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnhidePointList(final Iterable<? extends Integer> values) {
                this.ensureUnhidePointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unhidePointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnhidePointList() {
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBelongUid() {
                return this.belongUid_;
            }
            
            public Builder setBelongUid(final int value) {
                this.belongUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBelongUid() {
                this.belongUid_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnlockedPointListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.unlockedPointList_ = GeneratedMessageV3.mutableCopy(this.unlockedPointList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<Integer> getUnlockedPointListList() {
                return ((this.bitField0_ & 0x10) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unlockedPointList_) : this.unlockedPointList_;
            }
            
            @Override
            public int getUnlockedPointListCount() {
                return this.unlockedPointList_.size();
            }
            
            @Override
            public int getUnlockedPointList(final int index) {
                return this.unlockedPointList_.getInt(index);
            }
            
            public Builder setUnlockedPointList(final int index, final int value) {
                this.ensureUnlockedPointListIsMutable();
                this.unlockedPointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnlockedPointList(final int value) {
                this.ensureUnlockedPointListIsMutable();
                this.unlockedPointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnlockedPointList(final Iterable<? extends Integer> values) {
                this.ensureUnlockedPointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unlockedPointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnlockedPointList() {
                this.unlockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
                return this;
            }
            
            private void ensureUnlockAreaListIsMutable() {
                if ((this.bitField0_ & 0x20) == 0x0) {
                    this.unlockAreaList_ = GeneratedMessageV3.mutableCopy(this.unlockAreaList_);
                    this.bitField0_ |= 0x20;
                }
            }
            
            @Override
            public List<Integer> getUnlockAreaListList() {
                return ((this.bitField0_ & 0x20) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unlockAreaList_) : this.unlockAreaList_;
            }
            
            @Override
            public int getUnlockAreaListCount() {
                return this.unlockAreaList_.size();
            }
            
            @Override
            public int getUnlockAreaList(final int index) {
                return this.unlockAreaList_.getInt(index);
            }
            
            public Builder setUnlockAreaList(final int index, final int value) {
                this.ensureUnlockAreaListIsMutable();
                this.unlockAreaList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnlockAreaList(final int value) {
                this.ensureUnlockAreaListIsMutable();
                this.unlockAreaList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnlockAreaList(final Iterable<? extends Integer> values) {
                this.ensureUnlockAreaListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unlockAreaList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnlockAreaList() {
                this.unlockAreaList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFDF;
                this.onChanged();
                return this;
            }
            
            private void ensureHidePointListIsMutable() {
                if ((this.bitField0_ & 0x40) == 0x0) {
                    this.hidePointList_ = GeneratedMessageV3.mutableCopy(this.hidePointList_);
                    this.bitField0_ |= 0x40;
                }
            }
            
            @Override
            public List<Integer> getHidePointListList() {
                return ((this.bitField0_ & 0x40) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.hidePointList_) : this.hidePointList_;
            }
            
            @Override
            public int getHidePointListCount() {
                return this.hidePointList_.size();
            }
            
            @Override
            public int getHidePointList(final int index) {
                return this.hidePointList_.getInt(index);
            }
            
            public Builder setHidePointList(final int index, final int value) {
                this.ensureHidePointListIsMutable();
                this.hidePointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addHidePointList(final int value) {
                this.ensureHidePointListIsMutable();
                this.hidePointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllHidePointList(final Iterable<? extends Integer> values) {
                this.ensureHidePointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.hidePointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearHidePointList() {
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFBF;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureNotInteractDungeonEntryListIsMutable() {
                if ((this.bitField0_ & 0x80) == 0x0) {
                    this.notInteractDungeonEntryList_ = GeneratedMessageV3.mutableCopy(this.notInteractDungeonEntryList_);
                    this.bitField0_ |= 0x80;
                }
            }
            
            @Override
            public List<Integer> getNotInteractDungeonEntryListList() {
                return ((this.bitField0_ & 0x80) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.notInteractDungeonEntryList_) : this.notInteractDungeonEntryList_;
            }
            
            @Override
            public int getNotInteractDungeonEntryListCount() {
                return this.notInteractDungeonEntryList_.size();
            }
            
            @Override
            public int getNotInteractDungeonEntryList(final int index) {
                return this.notInteractDungeonEntryList_.getInt(index);
            }
            
            public Builder setNotInteractDungeonEntryList(final int index, final int value) {
                this.ensureNotInteractDungeonEntryListIsMutable();
                this.notInteractDungeonEntryList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addNotInteractDungeonEntryList(final int value) {
                this.ensureNotInteractDungeonEntryListIsMutable();
                this.notInteractDungeonEntryList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllNotInteractDungeonEntryList(final Iterable<? extends Integer> values) {
                this.ensureNotInteractDungeonEntryListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.notInteractDungeonEntryList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearNotInteractDungeonEntryList() {
                this.notInteractDungeonEntryList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFF7F;
                this.onChanged();
                return this;
            }
            
            private void ensureGroupUnlimitPointListIsMutable() {
                if ((this.bitField0_ & 0x100) == 0x0) {
                    this.groupUnlimitPointList_ = GeneratedMessageV3.mutableCopy(this.groupUnlimitPointList_);
                    this.bitField0_ |= 0x100;
                }
            }
            
            @Override
            public List<Integer> getGroupUnlimitPointListList() {
                return ((this.bitField0_ & 0x100) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.groupUnlimitPointList_) : this.groupUnlimitPointList_;
            }
            
            @Override
            public int getGroupUnlimitPointListCount() {
                return this.groupUnlimitPointList_.size();
            }
            
            @Override
            public int getGroupUnlimitPointList(final int index) {
                return this.groupUnlimitPointList_.getInt(index);
            }
            
            public Builder setGroupUnlimitPointList(final int index, final int value) {
                this.ensureGroupUnlimitPointListIsMutable();
                this.groupUnlimitPointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addGroupUnlimitPointList(final int value) {
                this.ensureGroupUnlimitPointListIsMutable();
                this.groupUnlimitPointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllGroupUnlimitPointList(final Iterable<? extends Integer> values) {
                this.ensureGroupUnlimitPointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.groupUnlimitPointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupUnlimitPointList() {
                this.groupUnlimitPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFEFF;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GetScenePointRspOrBuilder extends MessageOrBuilder
    {
        List<Integer> getNotExploredDungeonEntryListList();
        
        int getNotExploredDungeonEntryListCount();
        
        int getNotExploredDungeonEntryList(final int p0);
        
        List<Integer> getToBeExploreDungeonEntryListList();
        
        int getToBeExploreDungeonEntryListCount();
        
        int getToBeExploreDungeonEntryList(final int p0);
        
        List<Integer> getLockedPointListList();
        
        int getLockedPointListCount();
        
        int getLockedPointList(final int p0);
        
        List<Integer> getUnhidePointListList();
        
        int getUnhidePointListCount();
        
        int getUnhidePointList(final int p0);
        
        int getRetcode();
        
        int getBelongUid();
        
        List<Integer> getUnlockedPointListList();
        
        int getUnlockedPointListCount();
        
        int getUnlockedPointList(final int p0);
        
        List<Integer> getUnlockAreaListList();
        
        int getUnlockAreaListCount();
        
        int getUnlockAreaList(final int p0);
        
        List<Integer> getHidePointListList();
        
        int getHidePointListCount();
        
        int getHidePointList(final int p0);
        
        int getSceneId();
        
        List<Integer> getNotInteractDungeonEntryListList();
        
        int getNotInteractDungeonEntryListCount();
        
        int getNotInteractDungeonEntryList(final int p0);
        
        List<Integer> getGroupUnlimitPointListList();
        
        int getGroupUnlimitPointListCount();
        
        int getGroupUnlimitPointList(final int p0);
    }
}
