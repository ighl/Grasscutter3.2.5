// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PersonalLineAllDataRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PersonalLineAllDataRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PersonalLineAllDataRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PersonalLineAllDataRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PersonalLineAllDataRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cPersonalLineAllDataRsp.proto\u001a\u001cLockedPersonallineData.proto\"\u00f9\u0001\n\u0016PersonalLineAllDataRsp\u0012%\n\u001dcur_finished_daily_task_count\u0018\u0005 \u0001(\r\u0012*\n\"can_be_unlocked_personal_line_list\u0018\r \u0003(\r\u0012\u000f\n\u0007retcode\u0018\u000f \u0001(\u0005\u0012\"\n\u001aongoing_personal_line_list\u0018\b \u0003(\r\u0012\u001b\n\u0013legendary_key_count\u0018\u000b \u0001(\r\u0012:\n\u0019locked_personal_line_list\u0018\n \u0003(\u000b2\u0017.LockedPersonallineDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PersonalLineAllDataRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { LockedPersonallineDataOuterClass.getDescriptor() });
        internal_static_PersonalLineAllDataRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PersonalLineAllDataRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PersonalLineAllDataRspOuterClass.internal_static_PersonalLineAllDataRsp_descriptor, new String[] { "CurFinishedDailyTaskCount", "CanBeUnlockedPersonalLineList", "Retcode", "OngoingPersonalLineList", "LegendaryKeyCount", "LockedPersonalLineList" });
        LockedPersonallineDataOuterClass.getDescriptor();
    }
    
    public static final class PersonalLineAllDataRsp extends GeneratedMessageV3 implements PersonalLineAllDataRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_FINISHED_DAILY_TASK_COUNT_FIELD_NUMBER = 5;
        private int curFinishedDailyTaskCount_;
        public static final int CAN_BE_UNLOCKED_PERSONAL_LINE_LIST_FIELD_NUMBER = 13;
        private Internal.IntList canBeUnlockedPersonalLineList_;
        private int canBeUnlockedPersonalLineListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 15;
        private int retcode_;
        public static final int ONGOING_PERSONAL_LINE_LIST_FIELD_NUMBER = 8;
        private Internal.IntList ongoingPersonalLineList_;
        private int ongoingPersonalLineListMemoizedSerializedSize;
        public static final int LEGENDARY_KEY_COUNT_FIELD_NUMBER = 11;
        private int legendaryKeyCount_;
        public static final int LOCKED_PERSONAL_LINE_LIST_FIELD_NUMBER = 10;
        private List<LockedPersonallineDataOuterClass.LockedPersonallineData> lockedPersonalLineList_;
        private byte memoizedIsInitialized;
        private static final PersonalLineAllDataRsp DEFAULT_INSTANCE;
        private static final Parser<PersonalLineAllDataRsp> PARSER;
        
        private PersonalLineAllDataRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.canBeUnlockedPersonalLineListMemoizedSerializedSize = -1;
            this.ongoingPersonalLineListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private PersonalLineAllDataRsp() {
            this.canBeUnlockedPersonalLineListMemoizedSerializedSize = -1;
            this.ongoingPersonalLineListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.emptyIntList();
            this.ongoingPersonalLineList_ = GeneratedMessageV3.emptyIntList();
            this.lockedPersonalLineList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PersonalLineAllDataRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PersonalLineAllDataRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.curFinishedDailyTaskCount_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.ongoingPersonalLineList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.ongoingPersonalLineList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.ongoingPersonalLineList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.ongoingPersonalLineList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.lockedPersonalLineList_ = new ArrayList<LockedPersonallineDataOuterClass.LockedPersonallineData>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.lockedPersonalLineList_.add(input.readMessage(LockedPersonallineDataOuterClass.LockedPersonallineData.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.legendaryKeyCount_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.canBeUnlockedPersonalLineList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.canBeUnlockedPersonalLineList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 120: {
                            this.retcode_ = input.readInt32();
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.ongoingPersonalLineList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.lockedPersonalLineList_ = Collections.unmodifiableList((List<? extends LockedPersonallineDataOuterClass.LockedPersonallineData>)this.lockedPersonalLineList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.canBeUnlockedPersonalLineList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PersonalLineAllDataRspOuterClass.internal_static_PersonalLineAllDataRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PersonalLineAllDataRspOuterClass.internal_static_PersonalLineAllDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PersonalLineAllDataRsp.class, Builder.class);
        }
        
        @Override
        public int getCurFinishedDailyTaskCount() {
            return this.curFinishedDailyTaskCount_;
        }
        
        @Override
        public List<Integer> getCanBeUnlockedPersonalLineListList() {
            return this.canBeUnlockedPersonalLineList_;
        }
        
        @Override
        public int getCanBeUnlockedPersonalLineListCount() {
            return this.canBeUnlockedPersonalLineList_.size();
        }
        
        @Override
        public int getCanBeUnlockedPersonalLineList(final int index) {
            return this.canBeUnlockedPersonalLineList_.getInt(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<Integer> getOngoingPersonalLineListList() {
            return this.ongoingPersonalLineList_;
        }
        
        @Override
        public int getOngoingPersonalLineListCount() {
            return this.ongoingPersonalLineList_.size();
        }
        
        @Override
        public int getOngoingPersonalLineList(final int index) {
            return this.ongoingPersonalLineList_.getInt(index);
        }
        
        @Override
        public int getLegendaryKeyCount() {
            return this.legendaryKeyCount_;
        }
        
        @Override
        public List<LockedPersonallineDataOuterClass.LockedPersonallineData> getLockedPersonalLineListList() {
            return this.lockedPersonalLineList_;
        }
        
        @Override
        public List<? extends LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder> getLockedPersonalLineListOrBuilderList() {
            return this.lockedPersonalLineList_;
        }
        
        @Override
        public int getLockedPersonalLineListCount() {
            return this.lockedPersonalLineList_.size();
        }
        
        @Override
        public LockedPersonallineDataOuterClass.LockedPersonallineData getLockedPersonalLineList(final int index) {
            return this.lockedPersonalLineList_.get(index);
        }
        
        @Override
        public LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder getLockedPersonalLineListOrBuilder(final int index) {
            return this.lockedPersonalLineList_.get(index);
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
            if (this.curFinishedDailyTaskCount_ != 0) {
                output.writeUInt32(5, this.curFinishedDailyTaskCount_);
            }
            if (this.getOngoingPersonalLineListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.ongoingPersonalLineListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.ongoingPersonalLineList_.size(); ++i) {
                output.writeUInt32NoTag(this.ongoingPersonalLineList_.getInt(i));
            }
            for (int i = 0; i < this.lockedPersonalLineList_.size(); ++i) {
                output.writeMessage(10, this.lockedPersonalLineList_.get(i));
            }
            if (this.legendaryKeyCount_ != 0) {
                output.writeUInt32(11, this.legendaryKeyCount_);
            }
            if (this.getCanBeUnlockedPersonalLineListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.canBeUnlockedPersonalLineListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.canBeUnlockedPersonalLineList_.size(); ++i) {
                output.writeUInt32NoTag(this.canBeUnlockedPersonalLineList_.getInt(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(15, this.retcode_);
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
            if (this.curFinishedDailyTaskCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.curFinishedDailyTaskCount_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.ongoingPersonalLineList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.ongoingPersonalLineList_.getInt(i));
            }
            size += dataSize;
            if (!this.getOngoingPersonalLineListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.ongoingPersonalLineListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.lockedPersonalLineList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(10, this.lockedPersonalLineList_.get(j));
            }
            if (this.legendaryKeyCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.legendaryKeyCount_);
            }
            dataSize = 0;
            for (int i = 0; i < this.canBeUnlockedPersonalLineList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.canBeUnlockedPersonalLineList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCanBeUnlockedPersonalLineListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.canBeUnlockedPersonalLineListMemoizedSerializedSize = dataSize;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(15, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PersonalLineAllDataRsp)) {
                return super.equals(obj);
            }
            final PersonalLineAllDataRsp other = (PersonalLineAllDataRsp)obj;
            return this.getCurFinishedDailyTaskCount() == other.getCurFinishedDailyTaskCount() && this.getCanBeUnlockedPersonalLineListList().equals(other.getCanBeUnlockedPersonalLineListList()) && this.getRetcode() == other.getRetcode() && this.getOngoingPersonalLineListList().equals(other.getOngoingPersonalLineListList()) && this.getLegendaryKeyCount() == other.getLegendaryKeyCount() && this.getLockedPersonalLineListList().equals(other.getLockedPersonalLineListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getCurFinishedDailyTaskCount();
            if (this.getCanBeUnlockedPersonalLineListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getCanBeUnlockedPersonalLineListList().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getRetcode();
            if (this.getOngoingPersonalLineListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getOngoingPersonalLineListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getLegendaryKeyCount();
            if (this.getLockedPersonalLineListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getLockedPersonalLineListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PersonalLineAllDataRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PersonalLineAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalLineAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PersonalLineAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalLineAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PersonalLineAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalLineAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataRsp.PARSER, input);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static PersonalLineAllDataRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PersonalLineAllDataRsp.PARSER, input);
        }
        
        public static PersonalLineAllDataRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PersonalLineAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataRsp.PARSER, input);
        }
        
        public static PersonalLineAllDataRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PersonalLineAllDataRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PersonalLineAllDataRsp prototype) {
            return PersonalLineAllDataRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PersonalLineAllDataRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PersonalLineAllDataRsp getDefaultInstance() {
            return PersonalLineAllDataRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PersonalLineAllDataRsp> parser() {
            return PersonalLineAllDataRsp.PARSER;
        }
        
        @Override
        public Parser<PersonalLineAllDataRsp> getParserForType() {
            return PersonalLineAllDataRsp.PARSER;
        }
        
        @Override
        public PersonalLineAllDataRsp getDefaultInstanceForType() {
            return PersonalLineAllDataRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PersonalLineAllDataRsp();
            PARSER = new AbstractParser<PersonalLineAllDataRsp>() {
                @Override
                public PersonalLineAllDataRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PersonalLineAllDataRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PersonalLineAllDataRspOrBuilder
        {
            private int bitField0_;
            private int curFinishedDailyTaskCount_;
            private Internal.IntList canBeUnlockedPersonalLineList_;
            private int retcode_;
            private Internal.IntList ongoingPersonalLineList_;
            private int legendaryKeyCount_;
            private List<LockedPersonallineDataOuterClass.LockedPersonallineData> lockedPersonalLineList_;
            private RepeatedFieldBuilderV3<LockedPersonallineDataOuterClass.LockedPersonallineData, LockedPersonallineDataOuterClass.LockedPersonallineData.Builder, LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder> lockedPersonalLineListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PersonalLineAllDataRspOuterClass.internal_static_PersonalLineAllDataRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PersonalLineAllDataRspOuterClass.internal_static_PersonalLineAllDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PersonalLineAllDataRsp.class, Builder.class);
            }
            
            private Builder() {
                this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.ongoingPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.lockedPersonalLineList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.ongoingPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.lockedPersonalLineList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PersonalLineAllDataRsp.alwaysUseFieldBuilders) {
                    this.getLockedPersonalLineListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.curFinishedDailyTaskCount_ = 0;
                this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.retcode_ = 0;
                this.ongoingPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.legendaryKeyCount_ = 0;
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.lockedPersonalLineList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.lockedPersonalLineListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PersonalLineAllDataRspOuterClass.internal_static_PersonalLineAllDataRsp_descriptor;
            }
            
            @Override
            public PersonalLineAllDataRsp getDefaultInstanceForType() {
                return PersonalLineAllDataRsp.getDefaultInstance();
            }
            
            @Override
            public PersonalLineAllDataRsp build() {
                final PersonalLineAllDataRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PersonalLineAllDataRsp buildPartial() {
                final PersonalLineAllDataRsp result = new PersonalLineAllDataRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.curFinishedDailyTaskCount_ = this.curFinishedDailyTaskCount_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.canBeUnlockedPersonalLineList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.canBeUnlockedPersonalLineList_ = this.canBeUnlockedPersonalLineList_;
                result.retcode_ = this.retcode_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.ongoingPersonalLineList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.ongoingPersonalLineList_ = this.ongoingPersonalLineList_;
                result.legendaryKeyCount_ = this.legendaryKeyCount_;
                if (this.lockedPersonalLineListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.lockedPersonalLineList_ = Collections.unmodifiableList((List<? extends LockedPersonallineDataOuterClass.LockedPersonallineData>)this.lockedPersonalLineList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.lockedPersonalLineList_ = this.lockedPersonalLineList_;
                }
                else {
                    result.lockedPersonalLineList_ = this.lockedPersonalLineListBuilder_.build();
                }
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
                if (other instanceof PersonalLineAllDataRsp) {
                    return this.mergeFrom((PersonalLineAllDataRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PersonalLineAllDataRsp other) {
                if (other == PersonalLineAllDataRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getCurFinishedDailyTaskCount() != 0) {
                    this.setCurFinishedDailyTaskCount(other.getCurFinishedDailyTaskCount());
                }
                if (!other.canBeUnlockedPersonalLineList_.isEmpty()) {
                    if (this.canBeUnlockedPersonalLineList_.isEmpty()) {
                        this.canBeUnlockedPersonalLineList_ = other.canBeUnlockedPersonalLineList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCanBeUnlockedPersonalLineListIsMutable();
                        this.canBeUnlockedPersonalLineList_.addAll(other.canBeUnlockedPersonalLineList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.ongoingPersonalLineList_.isEmpty()) {
                    if (this.ongoingPersonalLineList_.isEmpty()) {
                        this.ongoingPersonalLineList_ = other.ongoingPersonalLineList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureOngoingPersonalLineListIsMutable();
                        this.ongoingPersonalLineList_.addAll(other.ongoingPersonalLineList_);
                    }
                    this.onChanged();
                }
                if (other.getLegendaryKeyCount() != 0) {
                    this.setLegendaryKeyCount(other.getLegendaryKeyCount());
                }
                if (this.lockedPersonalLineListBuilder_ == null) {
                    if (!other.lockedPersonalLineList_.isEmpty()) {
                        if (this.lockedPersonalLineList_.isEmpty()) {
                            this.lockedPersonalLineList_ = other.lockedPersonalLineList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureLockedPersonalLineListIsMutable();
                            this.lockedPersonalLineList_.addAll(other.lockedPersonalLineList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.lockedPersonalLineList_.isEmpty()) {
                    if (this.lockedPersonalLineListBuilder_.isEmpty()) {
                        this.lockedPersonalLineListBuilder_.dispose();
                        this.lockedPersonalLineListBuilder_ = null;
                        this.lockedPersonalLineList_ = other.lockedPersonalLineList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.lockedPersonalLineListBuilder_ = (PersonalLineAllDataRsp.alwaysUseFieldBuilders ? this.getLockedPersonalLineListFieldBuilder() : null);
                    }
                    else {
                        this.lockedPersonalLineListBuilder_.addAllMessages(other.lockedPersonalLineList_);
                    }
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
                PersonalLineAllDataRsp parsedMessage = null;
                try {
                    parsedMessage = PersonalLineAllDataRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PersonalLineAllDataRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getCurFinishedDailyTaskCount() {
                return this.curFinishedDailyTaskCount_;
            }
            
            public Builder setCurFinishedDailyTaskCount(final int value) {
                this.curFinishedDailyTaskCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurFinishedDailyTaskCount() {
                this.curFinishedDailyTaskCount_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureCanBeUnlockedPersonalLineListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.mutableCopy(this.canBeUnlockedPersonalLineList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCanBeUnlockedPersonalLineListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.canBeUnlockedPersonalLineList_) : this.canBeUnlockedPersonalLineList_;
            }
            
            @Override
            public int getCanBeUnlockedPersonalLineListCount() {
                return this.canBeUnlockedPersonalLineList_.size();
            }
            
            @Override
            public int getCanBeUnlockedPersonalLineList(final int index) {
                return this.canBeUnlockedPersonalLineList_.getInt(index);
            }
            
            public Builder setCanBeUnlockedPersonalLineList(final int index, final int value) {
                this.ensureCanBeUnlockedPersonalLineListIsMutable();
                this.canBeUnlockedPersonalLineList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCanBeUnlockedPersonalLineList(final int value) {
                this.ensureCanBeUnlockedPersonalLineListIsMutable();
                this.canBeUnlockedPersonalLineList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCanBeUnlockedPersonalLineList(final Iterable<? extends Integer> values) {
                this.ensureCanBeUnlockedPersonalLineListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.canBeUnlockedPersonalLineList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCanBeUnlockedPersonalLineList() {
                this.canBeUnlockedPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
            
            private void ensureOngoingPersonalLineListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.ongoingPersonalLineList_ = GeneratedMessageV3.mutableCopy(this.ongoingPersonalLineList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getOngoingPersonalLineListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.ongoingPersonalLineList_) : this.ongoingPersonalLineList_;
            }
            
            @Override
            public int getOngoingPersonalLineListCount() {
                return this.ongoingPersonalLineList_.size();
            }
            
            @Override
            public int getOngoingPersonalLineList(final int index) {
                return this.ongoingPersonalLineList_.getInt(index);
            }
            
            public Builder setOngoingPersonalLineList(final int index, final int value) {
                this.ensureOngoingPersonalLineListIsMutable();
                this.ongoingPersonalLineList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addOngoingPersonalLineList(final int value) {
                this.ensureOngoingPersonalLineListIsMutable();
                this.ongoingPersonalLineList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllOngoingPersonalLineList(final Iterable<? extends Integer> values) {
                this.ensureOngoingPersonalLineListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.ongoingPersonalLineList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearOngoingPersonalLineList() {
                this.ongoingPersonalLineList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLegendaryKeyCount() {
                return this.legendaryKeyCount_;
            }
            
            public Builder setLegendaryKeyCount(final int value) {
                this.legendaryKeyCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLegendaryKeyCount() {
                this.legendaryKeyCount_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureLockedPersonalLineListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.lockedPersonalLineList_ = new ArrayList<LockedPersonallineDataOuterClass.LockedPersonallineData>(this.lockedPersonalLineList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<LockedPersonallineDataOuterClass.LockedPersonallineData> getLockedPersonalLineListList() {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends LockedPersonallineDataOuterClass.LockedPersonallineData>)this.lockedPersonalLineList_);
                }
                return this.lockedPersonalLineListBuilder_.getMessageList();
            }
            
            @Override
            public int getLockedPersonalLineListCount() {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    return this.lockedPersonalLineList_.size();
                }
                return this.lockedPersonalLineListBuilder_.getCount();
            }
            
            @Override
            public LockedPersonallineDataOuterClass.LockedPersonallineData getLockedPersonalLineList(final int index) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    return this.lockedPersonalLineList_.get(index);
                }
                return this.lockedPersonalLineListBuilder_.getMessage(index);
            }
            
            public Builder setLockedPersonalLineList(final int index, final LockedPersonallineDataOuterClass.LockedPersonallineData value) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setLockedPersonalLineList(final int index, final LockedPersonallineDataOuterClass.LockedPersonallineData.Builder builderForValue) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addLockedPersonalLineList(final LockedPersonallineDataOuterClass.LockedPersonallineData value) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.add(value);
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addLockedPersonalLineList(final int index, final LockedPersonallineDataOuterClass.LockedPersonallineData value) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addLockedPersonalLineList(final LockedPersonallineDataOuterClass.LockedPersonallineData.Builder builderForValue) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addLockedPersonalLineList(final int index, final LockedPersonallineDataOuterClass.LockedPersonallineData.Builder builderForValue) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllLockedPersonalLineList(final Iterable<? extends LockedPersonallineDataOuterClass.LockedPersonallineData> values) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.ensureLockedPersonalLineListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.lockedPersonalLineList_);
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearLockedPersonalLineList() {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.lockedPersonalLineList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeLockedPersonalLineList(final int index) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.ensureLockedPersonalLineListIsMutable();
                    this.lockedPersonalLineList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.lockedPersonalLineListBuilder_.remove(index);
                }
                return this;
            }
            
            public LockedPersonallineDataOuterClass.LockedPersonallineData.Builder getLockedPersonalLineListBuilder(final int index) {
                return this.getLockedPersonalLineListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder getLockedPersonalLineListOrBuilder(final int index) {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    return this.lockedPersonalLineList_.get(index);
                }
                return this.lockedPersonalLineListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder> getLockedPersonalLineListOrBuilderList() {
                if (this.lockedPersonalLineListBuilder_ != null) {
                    return this.lockedPersonalLineListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder>)this.lockedPersonalLineList_);
            }
            
            public LockedPersonallineDataOuterClass.LockedPersonallineData.Builder addLockedPersonalLineListBuilder() {
                return this.getLockedPersonalLineListFieldBuilder().addBuilder(LockedPersonallineDataOuterClass.LockedPersonallineData.getDefaultInstance());
            }
            
            public LockedPersonallineDataOuterClass.LockedPersonallineData.Builder addLockedPersonalLineListBuilder(final int index) {
                return this.getLockedPersonalLineListFieldBuilder().addBuilder(index, LockedPersonallineDataOuterClass.LockedPersonallineData.getDefaultInstance());
            }
            
            public List<LockedPersonallineDataOuterClass.LockedPersonallineData.Builder> getLockedPersonalLineListBuilderList() {
                return this.getLockedPersonalLineListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<LockedPersonallineDataOuterClass.LockedPersonallineData, LockedPersonallineDataOuterClass.LockedPersonallineData.Builder, LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder> getLockedPersonalLineListFieldBuilder() {
                if (this.lockedPersonalLineListBuilder_ == null) {
                    this.lockedPersonalLineListBuilder_ = new RepeatedFieldBuilderV3<LockedPersonallineDataOuterClass.LockedPersonallineData, LockedPersonallineDataOuterClass.LockedPersonallineData.Builder, LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder>(this.lockedPersonalLineList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.lockedPersonalLineList_ = null;
                }
                return this.lockedPersonalLineListBuilder_;
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
    
    public interface PersonalLineAllDataRspOrBuilder extends MessageOrBuilder
    {
        int getCurFinishedDailyTaskCount();
        
        List<Integer> getCanBeUnlockedPersonalLineListList();
        
        int getCanBeUnlockedPersonalLineListCount();
        
        int getCanBeUnlockedPersonalLineList(final int p0);
        
        int getRetcode();
        
        List<Integer> getOngoingPersonalLineListList();
        
        int getOngoingPersonalLineListCount();
        
        int getOngoingPersonalLineList(final int p0);
        
        int getLegendaryKeyCount();
        
        List<LockedPersonallineDataOuterClass.LockedPersonallineData> getLockedPersonalLineListList();
        
        LockedPersonallineDataOuterClass.LockedPersonallineData getLockedPersonalLineList(final int p0);
        
        int getLockedPersonalLineListCount();
        
        List<? extends LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder> getLockedPersonalLineListOrBuilderList();
        
        LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder getLockedPersonalLineListOrBuilder(final int p0);
    }
}
