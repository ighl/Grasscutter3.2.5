// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class BuildingInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_BuildingInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BuildingInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BuildingInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BuildingInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012BuildingInfo.proto\"§\u0001\n\fBuildingInfo\u0012\u0013\n\u000bbuilding_id\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fpoint_config_id\u0018\u0002 \u0001(\r\u0012\f\n\u0004cost\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006refund\u0018\u0005 \u0001(\r\u0012\u0011\n\towner_uid\u0018\u0006 \u0001(\r\u0012\u001b\n\u0013Unk2700_MDJOPHOHFDB\u0018\u0007 \u0001(\r\u0012\u001b\n\u0013Unk2700_COFBIGLBNGP\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BuildingInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BuildingInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BuildingInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor, new String[] { "BuildingId", "PointConfigId", "Cost", "Refund", "OwnerUid", "Unk2700MDJOPHOHFDB", "Unk2700COFBIGLBNGP" });
    }
    
    public static final class BuildingInfo extends GeneratedMessageV3 implements BuildingInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BUILDING_ID_FIELD_NUMBER = 1;
        private int buildingId_;
        public static final int POINT_CONFIG_ID_FIELD_NUMBER = 2;
        private int pointConfigId_;
        public static final int COST_FIELD_NUMBER = 3;
        private int cost_;
        public static final int REFUND_FIELD_NUMBER = 5;
        private int refund_;
        public static final int OWNER_UID_FIELD_NUMBER = 6;
        private int ownerUid_;
        public static final int UNK2700_MDJOPHOHFDB_FIELD_NUMBER = 7;
        private int unk2700MDJOPHOHFDB_;
        public static final int UNK2700_COFBIGLBNGP_FIELD_NUMBER = 8;
        private int unk2700COFBIGLBNGP_;
        private byte memoizedIsInitialized;
        private static final BuildingInfo DEFAULT_INSTANCE;
        private static final Parser<BuildingInfo> PARSER;
        
        private BuildingInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BuildingInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BuildingInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BuildingInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                            this.buildingId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.pointConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.cost_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.refund_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.ownerUid_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.unk2700MDJOPHOHFDB_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.unk2700COFBIGLBNGP_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BuildingInfoOuterClass.internal_static_BuildingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BuildingInfo.class, Builder.class);
        }
        
        @Override
        public int getBuildingId() {
            return this.buildingId_;
        }
        
        @Override
        public int getPointConfigId() {
            return this.pointConfigId_;
        }
        
        @Override
        public int getCost() {
            return this.cost_;
        }
        
        @Override
        public int getRefund() {
            return this.refund_;
        }
        
        @Override
        public int getOwnerUid() {
            return this.ownerUid_;
        }
        
        @Override
        public int getUnk2700MDJOPHOHFDB() {
            return this.unk2700MDJOPHOHFDB_;
        }
        
        @Override
        public int getUnk2700COFBIGLBNGP() {
            return this.unk2700COFBIGLBNGP_;
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
            if (this.buildingId_ != 0) {
                output.writeUInt32(1, this.buildingId_);
            }
            if (this.pointConfigId_ != 0) {
                output.writeUInt32(2, this.pointConfigId_);
            }
            if (this.cost_ != 0) {
                output.writeUInt32(3, this.cost_);
            }
            if (this.refund_ != 0) {
                output.writeUInt32(5, this.refund_);
            }
            if (this.ownerUid_ != 0) {
                output.writeUInt32(6, this.ownerUid_);
            }
            if (this.unk2700MDJOPHOHFDB_ != 0) {
                output.writeUInt32(7, this.unk2700MDJOPHOHFDB_);
            }
            if (this.unk2700COFBIGLBNGP_ != 0) {
                output.writeUInt32(8, this.unk2700COFBIGLBNGP_);
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
            if (this.buildingId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.buildingId_);
            }
            if (this.pointConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.pointConfigId_);
            }
            if (this.cost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.cost_);
            }
            if (this.refund_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.refund_);
            }
            if (this.ownerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.ownerUid_);
            }
            if (this.unk2700MDJOPHOHFDB_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.unk2700MDJOPHOHFDB_);
            }
            if (this.unk2700COFBIGLBNGP_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.unk2700COFBIGLBNGP_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BuildingInfo)) {
                return super.equals(obj);
            }
            final BuildingInfo other = (BuildingInfo)obj;
            return this.getBuildingId() == other.getBuildingId() && this.getPointConfigId() == other.getPointConfigId() && this.getCost() == other.getCost() && this.getRefund() == other.getRefund() && this.getOwnerUid() == other.getOwnerUid() && this.getUnk2700MDJOPHOHFDB() == other.getUnk2700MDJOPHOHFDB() && this.getUnk2700COFBIGLBNGP() == other.getUnk2700COFBIGLBNGP() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getBuildingId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPointConfigId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCost();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRefund();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getOwnerUid();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getUnk2700MDJOPHOHFDB();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getUnk2700COFBIGLBNGP();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BuildingInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BuildingInfo.PARSER.parseFrom(data);
        }
        
        public static BuildingInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuildingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuildingInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BuildingInfo.PARSER.parseFrom(data);
        }
        
        public static BuildingInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuildingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuildingInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BuildingInfo.PARSER.parseFrom(data);
        }
        
        public static BuildingInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuildingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuildingInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuildingInfo.PARSER, input);
        }
        
        public static BuildingInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuildingInfo.PARSER, input, extensionRegistry);
        }
        
        public static BuildingInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuildingInfo.PARSER, input);
        }
        
        public static BuildingInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuildingInfo.PARSER, input, extensionRegistry);
        }
        
        public static BuildingInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuildingInfo.PARSER, input);
        }
        
        public static BuildingInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuildingInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BuildingInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BuildingInfo prototype) {
            return BuildingInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BuildingInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BuildingInfo getDefaultInstance() {
            return BuildingInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<BuildingInfo> parser() {
            return BuildingInfo.PARSER;
        }
        
        @Override
        public Parser<BuildingInfo> getParserForType() {
            return BuildingInfo.PARSER;
        }
        
        @Override
        public BuildingInfo getDefaultInstanceForType() {
            return BuildingInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BuildingInfo();
            PARSER = new AbstractParser<BuildingInfo>() {
                @Override
                public BuildingInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BuildingInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BuildingInfoOrBuilder
        {
            private int buildingId_;
            private int pointConfigId_;
            private int cost_;
            private int refund_;
            private int ownerUid_;
            private int unk2700MDJOPHOHFDB_;
            private int unk2700COFBIGLBNGP_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BuildingInfoOuterClass.internal_static_BuildingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BuildingInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BuildingInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.buildingId_ = 0;
                this.pointConfigId_ = 0;
                this.cost_ = 0;
                this.refund_ = 0;
                this.ownerUid_ = 0;
                this.unk2700MDJOPHOHFDB_ = 0;
                this.unk2700COFBIGLBNGP_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor;
            }
            
            @Override
            public BuildingInfo getDefaultInstanceForType() {
                return BuildingInfo.getDefaultInstance();
            }
            
            @Override
            public BuildingInfo build() {
                final BuildingInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BuildingInfo buildPartial() {
                final BuildingInfo result = new BuildingInfo(this);
                result.buildingId_ = this.buildingId_;
                result.pointConfigId_ = this.pointConfigId_;
                result.cost_ = this.cost_;
                result.refund_ = this.refund_;
                result.ownerUid_ = this.ownerUid_;
                result.unk2700MDJOPHOHFDB_ = this.unk2700MDJOPHOHFDB_;
                result.unk2700COFBIGLBNGP_ = this.unk2700COFBIGLBNGP_;
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
                if (other instanceof BuildingInfo) {
                    return this.mergeFrom((BuildingInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BuildingInfo other) {
                if (other == BuildingInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getBuildingId() != 0) {
                    this.setBuildingId(other.getBuildingId());
                }
                if (other.getPointConfigId() != 0) {
                    this.setPointConfigId(other.getPointConfigId());
                }
                if (other.getCost() != 0) {
                    this.setCost(other.getCost());
                }
                if (other.getRefund() != 0) {
                    this.setRefund(other.getRefund());
                }
                if (other.getOwnerUid() != 0) {
                    this.setOwnerUid(other.getOwnerUid());
                }
                if (other.getUnk2700MDJOPHOHFDB() != 0) {
                    this.setUnk2700MDJOPHOHFDB(other.getUnk2700MDJOPHOHFDB());
                }
                if (other.getUnk2700COFBIGLBNGP() != 0) {
                    this.setUnk2700COFBIGLBNGP(other.getUnk2700COFBIGLBNGP());
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
                BuildingInfo parsedMessage = null;
                try {
                    parsedMessage = BuildingInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BuildingInfo)e.getUnfinishedMessage();
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
            public int getBuildingId() {
                return this.buildingId_;
            }
            
            public Builder setBuildingId(final int value) {
                this.buildingId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBuildingId() {
                this.buildingId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPointConfigId() {
                return this.pointConfigId_;
            }
            
            public Builder setPointConfigId(final int value) {
                this.pointConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointConfigId() {
                this.pointConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCost() {
                return this.cost_;
            }
            
            public Builder setCost(final int value) {
                this.cost_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCost() {
                this.cost_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRefund() {
                return this.refund_;
            }
            
            public Builder setRefund(final int value) {
                this.refund_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRefund() {
                this.refund_ = 0;
                this.onChanged();
                return this;
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
            public int getUnk2700MDJOPHOHFDB() {
                return this.unk2700MDJOPHOHFDB_;
            }
            
            public Builder setUnk2700MDJOPHOHFDB(final int value) {
                this.unk2700MDJOPHOHFDB_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700MDJOPHOHFDB() {
                this.unk2700MDJOPHOHFDB_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700COFBIGLBNGP() {
                return this.unk2700COFBIGLBNGP_;
            }
            
            public Builder setUnk2700COFBIGLBNGP(final int value) {
                this.unk2700COFBIGLBNGP_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700COFBIGLBNGP() {
                this.unk2700COFBIGLBNGP_ = 0;
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
    
    public interface BuildingInfoOrBuilder extends MessageOrBuilder
    {
        int getBuildingId();
        
        int getPointConfigId();
        
        int getCost();
        
        int getRefund();
        
        int getOwnerUid();
        
        int getUnk2700MDJOPHOHFDB();
        
        int getUnk2700COFBIGLBNGP();
    }
}
