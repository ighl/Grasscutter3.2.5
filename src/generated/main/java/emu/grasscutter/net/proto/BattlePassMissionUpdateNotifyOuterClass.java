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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class BattlePassMissionUpdateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassMissionUpdateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassMissionUpdateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassMissionUpdateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#BattlePassMissionUpdateNotify.proto\u001a\u0017BattlePassMission.proto\"I\n\u001dBattlePassMissionUpdateNotify\u0012(\n\fmission_list\u0018\u0001 \u0003(\u000b2\u0012.BattlePassMissionB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassMissionUpdateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassMissionOuterClass.getDescriptor() });
        internal_static_BattlePassMissionUpdateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor, new String[] { "MissionList" });
        BattlePassMissionOuterClass.getDescriptor();
    }
    
    public static final class BattlePassMissionUpdateNotify extends GeneratedMessageV3 implements BattlePassMissionUpdateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MISSION_LIST_FIELD_NUMBER = 1;
        private List<BattlePassMissionOuterClass.BattlePassMission> missionList_;
        private byte memoizedIsInitialized;
        private static final BattlePassMissionUpdateNotify DEFAULT_INSTANCE;
        private static final Parser<BattlePassMissionUpdateNotify> PARSER;
        
        private BattlePassMissionUpdateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassMissionUpdateNotify() {
            this.memoizedIsInitialized = -1;
            this.missionList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassMissionUpdateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassMissionUpdateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassMissionUpdateNotify.class, Builder.class);
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
            for (int i = 0; i < this.missionList_.size(); ++i) {
                output.writeMessage(1, this.missionList_.get(i));
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
            for (int i = 0; i < this.missionList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.missionList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassMissionUpdateNotify)) {
                return super.equals(obj);
            }
            final BattlePassMissionUpdateNotify other = (BattlePassMissionUpdateNotify)obj;
            return this.getMissionListList().equals(other.getMissionListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMissionListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getMissionListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassMissionUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMissionUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassMissionUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMissionUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassMissionUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMissionUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionUpdateNotify.PARSER, input);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassMissionUpdateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassMissionUpdateNotify.PARSER, input);
        }
        
        public static BattlePassMissionUpdateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassMissionUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionUpdateNotify.PARSER, input);
        }
        
        public static BattlePassMissionUpdateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassMissionUpdateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassMissionUpdateNotify prototype) {
            return BattlePassMissionUpdateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassMissionUpdateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassMissionUpdateNotify getDefaultInstance() {
            return BattlePassMissionUpdateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassMissionUpdateNotify> parser() {
            return BattlePassMissionUpdateNotify.PARSER;
        }
        
        @Override
        public Parser<BattlePassMissionUpdateNotify> getParserForType() {
            return BattlePassMissionUpdateNotify.PARSER;
        }
        
        @Override
        public BattlePassMissionUpdateNotify getDefaultInstanceForType() {
            return BattlePassMissionUpdateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassMissionUpdateNotify();
            PARSER = new AbstractParser<BattlePassMissionUpdateNotify>() {
                @Override
                public BattlePassMissionUpdateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassMissionUpdateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassMissionUpdateNotifyOrBuilder
        {
            private int bitField0_;
            private List<BattlePassMissionOuterClass.BattlePassMission> missionList_;
            private RepeatedFieldBuilderV3<BattlePassMissionOuterClass.BattlePassMission, BattlePassMissionOuterClass.BattlePassMission.Builder, BattlePassMissionOuterClass.BattlePassMissionOrBuilder> missionListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassMissionUpdateNotify.class, Builder.class);
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
                if (BattlePassMissionUpdateNotify.alwaysUseFieldBuilders) {
                    this.getMissionListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.missionListBuilder_ == null) {
                    this.missionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.missionListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor;
            }
            
            @Override
            public BattlePassMissionUpdateNotify getDefaultInstanceForType() {
                return BattlePassMissionUpdateNotify.getDefaultInstance();
            }
            
            @Override
            public BattlePassMissionUpdateNotify build() {
                final BattlePassMissionUpdateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassMissionUpdateNotify buildPartial() {
                final BattlePassMissionUpdateNotify result = new BattlePassMissionUpdateNotify(this);
                final int from_bitField0_ = this.bitField0_;
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
                if (other instanceof BattlePassMissionUpdateNotify) {
                    return this.mergeFrom((BattlePassMissionUpdateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassMissionUpdateNotify other) {
                if (other == BattlePassMissionUpdateNotify.getDefaultInstance()) {
                    return this;
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
                        this.missionListBuilder_ = (BattlePassMissionUpdateNotify.alwaysUseFieldBuilders ? this.getMissionListFieldBuilder() : null);
                    }
                    else {
                        this.missionListBuilder_.addAllMessages(other.missionList_);
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
                BattlePassMissionUpdateNotify parsedMessage = null;
                try {
                    parsedMessage = BattlePassMissionUpdateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassMissionUpdateNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface BattlePassMissionUpdateNotifyOrBuilder extends MessageOrBuilder
    {
        List<BattlePassMissionOuterClass.BattlePassMission> getMissionListList();
        
        BattlePassMissionOuterClass.BattlePassMission getMissionList(final int p0);
        
        int getMissionListCount();
        
        List<? extends BattlePassMissionOuterClass.BattlePassMissionOrBuilder> getMissionListOrBuilderList();
        
        BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(final int p0);
    }
}
