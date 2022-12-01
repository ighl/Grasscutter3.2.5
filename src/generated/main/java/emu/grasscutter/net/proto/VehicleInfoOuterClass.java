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

public final class VehicleInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_VehicleInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_VehicleInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011VehicleInfo.proto\u001a\u0013VehicleMember.proto\"Z\n\u000bVehicleInfo\u0012#\n\u000bmember_list\u0018\u0001 \u0003(\u000b2\u000e.VehicleMember\u0012\u0011\n\towner_uid\u0018\u0002 \u0001(\r\u0012\u0013\n\u000bcur_stamina\u0018\u0003 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VehicleMemberOuterClass.getDescriptor() });
        internal_static_VehicleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VehicleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor, new String[] { "MemberList", "OwnerUid", "CurStamina" });
        VehicleMemberOuterClass.getDescriptor();
    }
    
    public static final class VehicleInfo extends GeneratedMessageV3 implements VehicleInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MEMBER_LIST_FIELD_NUMBER = 1;
        private List<VehicleMemberOuterClass.VehicleMember> memberList_;
        public static final int OWNER_UID_FIELD_NUMBER = 2;
        private int ownerUid_;
        public static final int CUR_STAMINA_FIELD_NUMBER = 3;
        private float curStamina_;
        private byte memoizedIsInitialized;
        private static final VehicleInfo DEFAULT_INSTANCE;
        private static final Parser<VehicleInfo> PARSER;
        
        private VehicleInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private VehicleInfo() {
            this.memoizedIsInitialized = -1;
            this.memberList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new VehicleInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private VehicleInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.memberList_ = new ArrayList<VehicleMemberOuterClass.VehicleMember>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.memberList_.add(input.readMessage(VehicleMemberOuterClass.VehicleMember.parser(), extensionRegistry));
                            continue;
                        }
                        case 16: {
                            this.ownerUid_ = input.readUInt32();
                            continue;
                        }
                        case 29: {
                            this.curStamina_ = input.readFloat();
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
                    this.memberList_ = Collections.unmodifiableList((List<? extends VehicleMemberOuterClass.VehicleMember>)this.memberList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return VehicleInfoOuterClass.internal_static_VehicleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleInfo.class, Builder.class);
        }
        
        @Override
        public List<VehicleMemberOuterClass.VehicleMember> getMemberListList() {
            return this.memberList_;
        }
        
        @Override
        public List<? extends VehicleMemberOuterClass.VehicleMemberOrBuilder> getMemberListOrBuilderList() {
            return this.memberList_;
        }
        
        @Override
        public int getMemberListCount() {
            return this.memberList_.size();
        }
        
        @Override
        public VehicleMemberOuterClass.VehicleMember getMemberList(final int index) {
            return this.memberList_.get(index);
        }
        
        @Override
        public VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberListOrBuilder(final int index) {
            return this.memberList_.get(index);
        }
        
        @Override
        public int getOwnerUid() {
            return this.ownerUid_;
        }
        
        @Override
        public float getCurStamina() {
            return this.curStamina_;
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
            for (int i = 0; i < this.memberList_.size(); ++i) {
                output.writeMessage(1, this.memberList_.get(i));
            }
            if (this.ownerUid_ != 0) {
                output.writeUInt32(2, this.ownerUid_);
            }
            if (this.curStamina_ != 0.0f) {
                output.writeFloat(3, this.curStamina_);
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
            for (int i = 0; i < this.memberList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.memberList_.get(i));
            }
            if (this.ownerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.ownerUid_);
            }
            if (this.curStamina_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(3, this.curStamina_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VehicleInfo)) {
                return super.equals(obj);
            }
            final VehicleInfo other = (VehicleInfo)obj;
            return this.getMemberListList().equals(other.getMemberListList()) && this.getOwnerUid() == other.getOwnerUid() && Float.floatToIntBits(this.getCurStamina()) == Float.floatToIntBits(other.getCurStamina()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMemberListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getMemberListList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getOwnerUid();
            hash = 37 * hash + 3;
            hash = 53 * hash + Float.floatToIntBits(this.getCurStamina());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static VehicleInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return VehicleInfo.PARSER.parseFrom(data);
        }
        
        public static VehicleInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return VehicleInfo.PARSER.parseFrom(data);
        }
        
        public static VehicleInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return VehicleInfo.PARSER.parseFrom(data);
        }
        
        public static VehicleInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInfo.PARSER, input);
        }
        
        public static VehicleInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInfo.PARSER, input, extensionRegistry);
        }
        
        public static VehicleInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleInfo.PARSER, input);
        }
        
        public static VehicleInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleInfo.PARSER, input, extensionRegistry);
        }
        
        public static VehicleInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInfo.PARSER, input);
        }
        
        public static VehicleInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return VehicleInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final VehicleInfo prototype) {
            return VehicleInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == VehicleInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static VehicleInfo getDefaultInstance() {
            return VehicleInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<VehicleInfo> parser() {
            return VehicleInfo.PARSER;
        }
        
        @Override
        public Parser<VehicleInfo> getParserForType() {
            return VehicleInfo.PARSER;
        }
        
        @Override
        public VehicleInfo getDefaultInstanceForType() {
            return VehicleInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new VehicleInfo();
            PARSER = new AbstractParser<VehicleInfo>() {
                @Override
                public VehicleInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new VehicleInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VehicleInfoOrBuilder
        {
            private int bitField0_;
            private List<VehicleMemberOuterClass.VehicleMember> memberList_;
            private RepeatedFieldBuilderV3<VehicleMemberOuterClass.VehicleMember, VehicleMemberOuterClass.VehicleMember.Builder, VehicleMemberOuterClass.VehicleMemberOrBuilder> memberListBuilder_;
            private int ownerUid_;
            private float curStamina_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return VehicleInfoOuterClass.internal_static_VehicleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleInfo.class, Builder.class);
            }
            
            private Builder() {
                this.memberList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.memberList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (VehicleInfo.alwaysUseFieldBuilders) {
                    this.getMemberListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.memberListBuilder_ == null) {
                    this.memberList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.memberListBuilder_.clear();
                }
                this.ownerUid_ = 0;
                this.curStamina_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor;
            }
            
            @Override
            public VehicleInfo getDefaultInstanceForType() {
                return VehicleInfo.getDefaultInstance();
            }
            
            @Override
            public VehicleInfo build() {
                final VehicleInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public VehicleInfo buildPartial() {
                final VehicleInfo result = new VehicleInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.memberListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.memberList_ = Collections.unmodifiableList((List<? extends VehicleMemberOuterClass.VehicleMember>)this.memberList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.memberList_ = this.memberList_;
                }
                else {
                    result.memberList_ = this.memberListBuilder_.build();
                }
                result.ownerUid_ = this.ownerUid_;
                result.curStamina_ = this.curStamina_;
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
                if (other instanceof VehicleInfo) {
                    return this.mergeFrom((VehicleInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final VehicleInfo other) {
                if (other == VehicleInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.memberListBuilder_ == null) {
                    if (!other.memberList_.isEmpty()) {
                        if (this.memberList_.isEmpty()) {
                            this.memberList_ = other.memberList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMemberListIsMutable();
                            this.memberList_.addAll(other.memberList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.memberList_.isEmpty()) {
                    if (this.memberListBuilder_.isEmpty()) {
                        this.memberListBuilder_.dispose();
                        this.memberListBuilder_ = null;
                        this.memberList_ = other.memberList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.memberListBuilder_ = (VehicleInfo.alwaysUseFieldBuilders ? this.getMemberListFieldBuilder() : null);
                    }
                    else {
                        this.memberListBuilder_.addAllMessages(other.memberList_);
                    }
                }
                if (other.getOwnerUid() != 0) {
                    this.setOwnerUid(other.getOwnerUid());
                }
                if (other.getCurStamina() != 0.0f) {
                    this.setCurStamina(other.getCurStamina());
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
                VehicleInfo parsedMessage = null;
                try {
                    parsedMessage = VehicleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (VehicleInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMemberListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.memberList_ = new ArrayList<VehicleMemberOuterClass.VehicleMember>(this.memberList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<VehicleMemberOuterClass.VehicleMember> getMemberListList() {
                if (this.memberListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends VehicleMemberOuterClass.VehicleMember>)this.memberList_);
                }
                return this.memberListBuilder_.getMessageList();
            }
            
            @Override
            public int getMemberListCount() {
                if (this.memberListBuilder_ == null) {
                    return this.memberList_.size();
                }
                return this.memberListBuilder_.getCount();
            }
            
            @Override
            public VehicleMemberOuterClass.VehicleMember getMemberList(final int index) {
                if (this.memberListBuilder_ == null) {
                    return this.memberList_.get(index);
                }
                return this.memberListBuilder_.getMessage(index);
            }
            
            public Builder setMemberList(final int index, final VehicleMemberOuterClass.VehicleMember value) {
                if (this.memberListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMemberListIsMutable();
                    this.memberList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMemberList(final int index, final VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
                if (this.memberListBuilder_ == null) {
                    this.ensureMemberListIsMutable();
                    this.memberList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMemberList(final VehicleMemberOuterClass.VehicleMember value) {
                if (this.memberListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMemberListIsMutable();
                    this.memberList_.add(value);
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMemberList(final int index, final VehicleMemberOuterClass.VehicleMember value) {
                if (this.memberListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMemberListIsMutable();
                    this.memberList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMemberList(final VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
                if (this.memberListBuilder_ == null) {
                    this.ensureMemberListIsMutable();
                    this.memberList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMemberList(final int index, final VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
                if (this.memberListBuilder_ == null) {
                    this.ensureMemberListIsMutable();
                    this.memberList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMemberList(final Iterable<? extends VehicleMemberOuterClass.VehicleMember> values) {
                if (this.memberListBuilder_ == null) {
                    this.ensureMemberListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.memberList_);
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMemberList() {
                if (this.memberListBuilder_ == null) {
                    this.memberList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMemberList(final int index) {
                if (this.memberListBuilder_ == null) {
                    this.ensureMemberListIsMutable();
                    this.memberList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.memberListBuilder_.remove(index);
                }
                return this;
            }
            
            public VehicleMemberOuterClass.VehicleMember.Builder getMemberListBuilder(final int index) {
                return this.getMemberListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberListOrBuilder(final int index) {
                if (this.memberListBuilder_ == null) {
                    return this.memberList_.get(index);
                }
                return this.memberListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends VehicleMemberOuterClass.VehicleMemberOrBuilder> getMemberListOrBuilderList() {
                if (this.memberListBuilder_ != null) {
                    return this.memberListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends VehicleMemberOuterClass.VehicleMemberOrBuilder>)this.memberList_);
            }
            
            public VehicleMemberOuterClass.VehicleMember.Builder addMemberListBuilder() {
                return this.getMemberListFieldBuilder().addBuilder(VehicleMemberOuterClass.VehicleMember.getDefaultInstance());
            }
            
            public VehicleMemberOuterClass.VehicleMember.Builder addMemberListBuilder(final int index) {
                return this.getMemberListFieldBuilder().addBuilder(index, VehicleMemberOuterClass.VehicleMember.getDefaultInstance());
            }
            
            public List<VehicleMemberOuterClass.VehicleMember.Builder> getMemberListBuilderList() {
                return this.getMemberListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<VehicleMemberOuterClass.VehicleMember, VehicleMemberOuterClass.VehicleMember.Builder, VehicleMemberOuterClass.VehicleMemberOrBuilder> getMemberListFieldBuilder() {
                if (this.memberListBuilder_ == null) {
                    this.memberListBuilder_ = new RepeatedFieldBuilderV3<VehicleMemberOuterClass.VehicleMember, VehicleMemberOuterClass.VehicleMember.Builder, VehicleMemberOuterClass.VehicleMemberOrBuilder>(this.memberList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.memberList_ = null;
                }
                return this.memberListBuilder_;
            }
            
            @Override
            public int getOwnerUid() {
                return this.ownerUid_;
            }
            
            public Builder setOwnerUid(final int value) {
                this.ownerUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerUid() {
                this.ownerUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getCurStamina() {
                return this.curStamina_;
            }
            
            public Builder setCurStamina(final float value) {
                this.curStamina_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurStamina() {
                this.curStamina_ = 0.0f;
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
    
    public interface VehicleInfoOrBuilder extends MessageOrBuilder
    {
        List<VehicleMemberOuterClass.VehicleMember> getMemberListList();
        
        VehicleMemberOuterClass.VehicleMember getMemberList(final int p0);
        
        int getMemberListCount();
        
        List<? extends VehicleMemberOuterClass.VehicleMemberOrBuilder> getMemberListOrBuilderList();
        
        VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberListOrBuilder(final int p0);
        
        int getOwnerUid();
        
        float getCurStamina();
    }
}
