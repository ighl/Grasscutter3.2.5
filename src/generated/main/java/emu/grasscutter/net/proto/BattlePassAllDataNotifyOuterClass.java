// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class BattlePassAllDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassAllDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassAllDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassAllDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassAllDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dBattlePassAllDataNotify.proto\u001a\u0017BattlePassMission.proto\u001a\u0018BattlePassSchedule.proto\"\u0089\u0001\n\u0017BattlePassAllDataNotify\u0012\u0019\n\u0011have_cur_schedule\u0018\u0002 \u0001(\b\u0012(\n\fmission_list\u0018\u0004 \u0003(\u000b2\u0012.BattlePassMission\u0012)\n\fcur_schedule\u0018\u0001 \u0001(\u000b2\u0013.BattlePassScheduleB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassAllDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassMissionOuterClass.getDescriptor(), BattlePassScheduleOuterClass.getDescriptor() });
        internal_static_BattlePassAllDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassAllDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassAllDataNotifyOuterClass.internal_static_BattlePassAllDataNotify_descriptor, new String[] { "HaveCurSchedule", "MissionList", "CurSchedule" });
        BattlePassMissionOuterClass.getDescriptor();
        BattlePassScheduleOuterClass.getDescriptor();
    }
    
    public static final class BattlePassAllDataNotify extends GeneratedMessageV3 implements BattlePassAllDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HAVE_CUR_SCHEDULE_FIELD_NUMBER = 2;
        private boolean haveCurSchedule_;
        public static final int MISSION_LIST_FIELD_NUMBER = 4;
        private List<BattlePassMissionOuterClass.BattlePassMission> missionList_;
        public static final int CUR_SCHEDULE_FIELD_NUMBER = 1;
        private BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
        private byte memoizedIsInitialized;
        private static final BattlePassAllDataNotify DEFAULT_INSTANCE;
        private static final Parser<BattlePassAllDataNotify> PARSER;
        
        private BattlePassAllDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassAllDataNotify() {
            this.memoizedIsInitialized = -1;
            this.missionList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassAllDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassAllDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            BattlePassScheduleOuterClass.BattlePassSchedule.Builder subBuilder = null;
                            if (this.curSchedule_ != null) {
                                subBuilder = this.curSchedule_.toBuilder();
                            }
                            this.curSchedule_ = input.readMessage(BattlePassScheduleOuterClass.BattlePassSchedule.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.curSchedule_);
                                this.curSchedule_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 16: {
                            this.haveCurSchedule_ = input.readBool();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.missionList_ = new ArrayList<BattlePassMissionOuterClass.BattlePassMission>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.missionList_.add(input.readMessage(BattlePassMissionOuterClass.BattlePassMission.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.missionList_ = Collections.unmodifiableList((List<? extends BattlePassMissionOuterClass.BattlePassMission>)this.missionList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BattlePassAllDataNotifyOuterClass.internal_static_BattlePassAllDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassAllDataNotifyOuterClass.internal_static_BattlePassAllDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassAllDataNotify.class, Builder.class);
        }
        
        @Override
        public boolean getHaveCurSchedule() {
            return this.haveCurSchedule_;
        }
        
        @Override
        public List<BattlePassMissionOuterClass.BattlePassMission> getMissionListList() {
            return this.missionList_;
        }
        
        @Override
        public List<? extends BattlePassMissionOuterClass.BattlePassMissionOrBuilder> getMissionListOrBuilderList() {
            return this.missionList_;
        }
        
        @Override
        public int getMissionListCount() {
            return this.missionList_.size();
        }
        
        @Override
        public BattlePassMissionOuterClass.BattlePassMission getMissionList(final int index) {
            return this.missionList_.get(index);
        }
        
        @Override
        public BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(final int index) {
            return this.missionList_.get(index);
        }
        
        @Override
        public boolean hasCurSchedule() {
            return this.curSchedule_ != null;
        }
        
        @Override
        public BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
            return (this.curSchedule_ == null) ? BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : this.curSchedule_;
        }
        
        @Override
        public BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
            return this.getCurSchedule();
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
            if (this.curSchedule_ != null) {
                output.writeMessage(1, this.getCurSchedule());
            }
            if (this.haveCurSchedule_) {
                output.writeBool(2, this.haveCurSchedule_);
            }
            for (int i = 0; i < this.missionList_.size(); ++i) {
                output.writeMessage(4, this.missionList_.get(i));
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
            if (this.curSchedule_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getCurSchedule());
            }
            if (this.haveCurSchedule_) {
                size += CodedOutputStream.computeBoolSize(2, this.haveCurSchedule_);
            }
            for (int i = 0; i < this.missionList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.missionList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassAllDataNotify)) {
                return super.equals(obj);
            }
            final BattlePassAllDataNotify other = (BattlePassAllDataNotify)obj;
            return this.getHaveCurSchedule() == other.getHaveCurSchedule() && this.getMissionListList().equals(other.getMissionListList()) && this.hasCurSchedule() == other.hasCurSchedule() && (!this.hasCurSchedule() || this.getCurSchedule().equals(other.getCurSchedule())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getHaveCurSchedule());
            if (this.getMissionListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getMissionListList().hashCode();
            }
            if (this.hasCurSchedule()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getCurSchedule().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassAllDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassAllDataNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassAllDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassAllDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassAllDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassAllDataNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassAllDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassAllDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassAllDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassAllDataNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassAllDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassAllDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassAllDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassAllDataNotify.PARSER, input);
        }
        
        public static BattlePassAllDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassAllDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassAllDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassAllDataNotify.PARSER, input);
        }
        
        public static BattlePassAllDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassAllDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassAllDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassAllDataNotify.PARSER, input);
        }
        
        public static BattlePassAllDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassAllDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassAllDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassAllDataNotify prototype) {
            return BattlePassAllDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassAllDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassAllDataNotify getDefaultInstance() {
            return BattlePassAllDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassAllDataNotify> parser() {
            return BattlePassAllDataNotify.PARSER;
        }
        
        @Override
        public Parser<BattlePassAllDataNotify> getParserForType() {
            return BattlePassAllDataNotify.PARSER;
        }
        
        @Override
        public BattlePassAllDataNotify getDefaultInstanceForType() {
            return BattlePassAllDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassAllDataNotify();
            PARSER = new AbstractParser<BattlePassAllDataNotify>() {
                @Override
                public BattlePassAllDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassAllDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassAllDataNotifyOrBuilder
        {
            private int bitField0_;
            private boolean haveCurSchedule_;
            private List<BattlePassMissionOuterClass.BattlePassMission> missionList_;
            private RepeatedFieldBuilderV3<BattlePassMissionOuterClass.BattlePassMission, BattlePassMissionOuterClass.BattlePassMission.Builder, BattlePassMissionOuterClass.BattlePassMissionOrBuilder> missionListBuilder_;
            private BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
            private SingleFieldBuilderV3<BattlePassScheduleOuterClass.BattlePassSchedule, BattlePassScheduleOuterClass.BattlePassSchedule.Builder, BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> curScheduleBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassAllDataNotifyOuterClass.internal_static_BattlePassAllDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassAllDataNotifyOuterClass.internal_static_BattlePassAllDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassAllDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.missionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.missionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassAllDataNotify.alwaysUseFieldBuilders) {
                    this.getMissionListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.haveCurSchedule_ = false;
                if (this.missionListBuilder_ == null) {
                    this.missionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.missionListBuilder_.clear();
                }
                if (this.curScheduleBuilder_ == null) {
                    this.curSchedule_ = null;
                }
                else {
                    this.curSchedule_ = null;
                    this.curScheduleBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassAllDataNotifyOuterClass.internal_static_BattlePassAllDataNotify_descriptor;
            }
            
            @Override
            public BattlePassAllDataNotify getDefaultInstanceForType() {
                return BattlePassAllDataNotify.getDefaultInstance();
            }
            
            @Override
            public BattlePassAllDataNotify build() {
                final BattlePassAllDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassAllDataNotify buildPartial() {
                final BattlePassAllDataNotify result = new BattlePassAllDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.haveCurSchedule_ = this.haveCurSchedule_;
                if (this.missionListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.missionList_ = Collections.unmodifiableList((List<? extends BattlePassMissionOuterClass.BattlePassMission>)this.missionList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.missionList_ = this.missionList_;
                }
                else {
                    result.missionList_ = this.missionListBuilder_.build();
                }
                if (this.curScheduleBuilder_ == null) {
                    result.curSchedule_ = this.curSchedule_;
                }
                else {
                    result.curSchedule_ = this.curScheduleBuilder_.build();
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
                if (other instanceof BattlePassAllDataNotify) {
                    return this.mergeFrom((BattlePassAllDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassAllDataNotify other) {
                if (other == BattlePassAllDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getHaveCurSchedule()) {
                    this.setHaveCurSchedule(other.getHaveCurSchedule());
                }
                if (this.missionListBuilder_ == null) {
                    if (!other.missionList_.isEmpty()) {
                        if (this.missionList_.isEmpty()) {
                            this.missionList_ = other.missionList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMissionListIsMutable();
                            this.missionList_.addAll(other.missionList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.missionList_.isEmpty()) {
                    if (this.missionListBuilder_.isEmpty()) {
                        this.missionListBuilder_.dispose();
                        this.missionListBuilder_ = null;
                        this.missionList_ = other.missionList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.missionListBuilder_ = (BattlePassAllDataNotify.alwaysUseFieldBuilders ? this.getMissionListFieldBuilder() : null);
                    }
                    else {
                        this.missionListBuilder_.addAllMessages(other.missionList_);
                    }
                }
                if (other.hasCurSchedule()) {
                    this.mergeCurSchedule(other.getCurSchedule());
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
                BattlePassAllDataNotify parsedMessage = null;
                try {
                    parsedMessage = BattlePassAllDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassAllDataNotify)e.getUnfinishedMessage();
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
            public boolean getHaveCurSchedule() {
                return this.haveCurSchedule_;
            }
            
            public Builder setHaveCurSchedule(final boolean value) {
                this.haveCurSchedule_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHaveCurSchedule() {
                this.haveCurSchedule_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureMissionListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.missionList_ = new ArrayList<BattlePassMissionOuterClass.BattlePassMission>(this.missionList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<BattlePassMissionOuterClass.BattlePassMission> getMissionListList() {
                if (this.missionListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends BattlePassMissionOuterClass.BattlePassMission>)this.missionList_);
                }
                return this.missionListBuilder_.getMessageList();
            }
            
            @Override
            public int getMissionListCount() {
                if (this.missionListBuilder_ == null) {
                    return this.missionList_.size();
                }
                return this.missionListBuilder_.getCount();
            }
            
            @Override
            public BattlePassMissionOuterClass.BattlePassMission getMissionList(final int index) {
                if (this.missionListBuilder_ == null) {
                    return this.missionList_.get(index);
                }
                return this.missionListBuilder_.getMessage(index);
            }
            
            public Builder setMissionList(final int index, final BattlePassMissionOuterClass.BattlePassMission value) {
                if (this.missionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMissionListIsMutable();
                    this.missionList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMissionList(final int index, final BattlePassMissionOuterClass.BattlePassMission.Builder builderForValue) {
                if (this.missionListBuilder_ == null) {
                    this.ensureMissionListIsMutable();
                    this.missionList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMissionList(final BattlePassMissionOuterClass.BattlePassMission value) {
                if (this.missionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMissionListIsMutable();
                    this.missionList_.add(value);
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMissionList(final int index, final BattlePassMissionOuterClass.BattlePassMission value) {
                if (this.missionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMissionListIsMutable();
                    this.missionList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMissionList(final BattlePassMissionOuterClass.BattlePassMission.Builder builderForValue) {
                if (this.missionListBuilder_ == null) {
                    this.ensureMissionListIsMutable();
                    this.missionList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMissionList(final int index, final BattlePassMissionOuterClass.BattlePassMission.Builder builderForValue) {
                if (this.missionListBuilder_ == null) {
                    this.ensureMissionListIsMutable();
                    this.missionList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMissionList(final Iterable<? extends BattlePassMissionOuterClass.BattlePassMission> values) {
                if (this.missionListBuilder_ == null) {
                    this.ensureMissionListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.missionList_);
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMissionList() {
                if (this.missionListBuilder_ == null) {
                    this.missionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMissionList(final int index) {
                if (this.missionListBuilder_ == null) {
                    this.ensureMissionListIsMutable();
                    this.missionList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.missionListBuilder_.remove(index);
                }
                return this;
            }
            
            public BattlePassMissionOuterClass.BattlePassMission.Builder getMissionListBuilder(final int index) {
                return this.getMissionListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(final int index) {
                if (this.missionListBuilder_ == null) {
                    return this.missionList_.get(index);
                }
                return this.missionListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends BattlePassMissionOuterClass.BattlePassMissionOrBuilder> getMissionListOrBuilderList() {
                if (this.missionListBuilder_ != null) {
                    return this.missionListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends BattlePassMissionOuterClass.BattlePassMissionOrBuilder>)this.missionList_);
            }
            
            public BattlePassMissionOuterClass.BattlePassMission.Builder addMissionListBuilder() {
                return this.getMissionListFieldBuilder().addBuilder(BattlePassMissionOuterClass.BattlePassMission.getDefaultInstance());
            }
            
            public BattlePassMissionOuterClass.BattlePassMission.Builder addMissionListBuilder(final int index) {
                return this.getMissionListFieldBuilder().addBuilder(index, BattlePassMissionOuterClass.BattlePassMission.getDefaultInstance());
            }
            
            public List<BattlePassMissionOuterClass.BattlePassMission.Builder> getMissionListBuilderList() {
                return this.getMissionListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<BattlePassMissionOuterClass.BattlePassMission, BattlePassMissionOuterClass.BattlePassMission.Builder, BattlePassMissionOuterClass.BattlePassMissionOrBuilder> getMissionListFieldBuilder() {
                if (this.missionListBuilder_ == null) {
                    this.missionListBuilder_ = new RepeatedFieldBuilderV3<BattlePassMissionOuterClass.BattlePassMission, BattlePassMissionOuterClass.BattlePassMission.Builder, BattlePassMissionOuterClass.BattlePassMissionOrBuilder>(this.missionList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.missionList_ = null;
                }
                return this.missionListBuilder_;
            }
            
            @Override
            public boolean hasCurSchedule() {
                return this.curScheduleBuilder_ != null || this.curSchedule_ != null;
            }
            
            @Override
            public BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
                if (this.curScheduleBuilder_ == null) {
                    return (this.curSchedule_ == null) ? BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : this.curSchedule_;
                }
                return this.curScheduleBuilder_.getMessage();
            }
            
            public Builder setCurSchedule(final BattlePassScheduleOuterClass.BattlePassSchedule value) {
                if (this.curScheduleBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.curSchedule_ = value;
                    this.onChanged();
                }
                else {
                    this.curScheduleBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCurSchedule(final BattlePassScheduleOuterClass.BattlePassSchedule.Builder builderForValue) {
                if (this.curScheduleBuilder_ == null) {
                    this.curSchedule_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.curScheduleBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCurSchedule(final BattlePassScheduleOuterClass.BattlePassSchedule value) {
                if (this.curScheduleBuilder_ == null) {
                    if (this.curSchedule_ != null) {
                        this.curSchedule_ = BattlePassScheduleOuterClass.BattlePassSchedule.newBuilder(this.curSchedule_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.curSchedule_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.curScheduleBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCurSchedule() {
                if (this.curScheduleBuilder_ == null) {
                    this.curSchedule_ = null;
                    this.onChanged();
                }
                else {
                    this.curSchedule_ = null;
                    this.curScheduleBuilder_ = null;
                }
                return this;
            }
            
            public BattlePassScheduleOuterClass.BattlePassSchedule.Builder getCurScheduleBuilder() {
                this.onChanged();
                return this.getCurScheduleFieldBuilder().getBuilder();
            }
            
            @Override
            public BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
                if (this.curScheduleBuilder_ != null) {
                    return this.curScheduleBuilder_.getMessageOrBuilder();
                }
                return (this.curSchedule_ == null) ? BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : this.curSchedule_;
            }
            
            private SingleFieldBuilderV3<BattlePassScheduleOuterClass.BattlePassSchedule, BattlePassScheduleOuterClass.BattlePassSchedule.Builder, BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> getCurScheduleFieldBuilder() {
                if (this.curScheduleBuilder_ == null) {
                    this.curScheduleBuilder_ = new SingleFieldBuilderV3<BattlePassScheduleOuterClass.BattlePassSchedule, BattlePassScheduleOuterClass.BattlePassSchedule.Builder, BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder>(this.getCurSchedule(), this.getParentForChildren(), this.isClean());
                    this.curSchedule_ = null;
                }
                return this.curScheduleBuilder_;
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
    
    public interface BattlePassAllDataNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getHaveCurSchedule();
        
        List<BattlePassMissionOuterClass.BattlePassMission> getMissionListList();
        
        BattlePassMissionOuterClass.BattlePassMission getMissionList(final int p0);
        
        int getMissionListCount();
        
        List<? extends BattlePassMissionOuterClass.BattlePassMissionOrBuilder> getMissionListOrBuilderList();
        
        BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(final int p0);
        
        boolean hasCurSchedule();
        
        BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule();
        
        BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder();
    }
}
