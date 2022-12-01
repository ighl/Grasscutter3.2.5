// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarEquipChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarEquipChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarEquipChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarEquipChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarEquipChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAvatarEquipChangeNotify.proto\u001a\u0018SceneReliquaryInfo.proto\u001a\u0015SceneWeaponInfo.proto\"±\u0001\n\u0017AvatarEquipChangeNotify\u0012\u0013\n\u000bavatar_guid\u0018\u000b \u0001(\u0004\u0012\u0012\n\nequip_guid\u0018\t \u0001(\u0004\u0012&\n\treliquary\u0018\f \u0001(\u000b2\u0013.SceneReliquaryInfo\u0012 \n\u0006weapon\u0018\u0004 \u0001(\u000b2\u0010.SceneWeaponInfo\u0012\u000f\n\u0007item_id\u0018\n \u0001(\r\u0012\u0012\n\nequip_type\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarEquipChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { SceneReliquaryInfoOuterClass.getDescriptor(), SceneWeaponInfoOuterClass.getDescriptor() });
        internal_static_AvatarEquipChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarEquipChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarEquipChangeNotifyOuterClass.internal_static_AvatarEquipChangeNotify_descriptor, new String[] { "AvatarGuid", "EquipGuid", "Reliquary", "Weapon", "ItemId", "EquipType" });
        SceneReliquaryInfoOuterClass.getDescriptor();
        SceneWeaponInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarEquipChangeNotify extends GeneratedMessageV3 implements AvatarEquipChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 11;
        private long avatarGuid_;
        public static final int EQUIP_GUID_FIELD_NUMBER = 9;
        private long equipGuid_;
        public static final int RELIQUARY_FIELD_NUMBER = 12;
        private SceneReliquaryInfoOuterClass.SceneReliquaryInfo reliquary_;
        public static final int WEAPON_FIELD_NUMBER = 4;
        private SceneWeaponInfoOuterClass.SceneWeaponInfo weapon_;
        public static final int ITEM_ID_FIELD_NUMBER = 10;
        private int itemId_;
        public static final int EQUIP_TYPE_FIELD_NUMBER = 2;
        private int equipType_;
        private byte memoizedIsInitialized;
        private static final AvatarEquipChangeNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarEquipChangeNotify> PARSER;
        
        private AvatarEquipChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarEquipChangeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarEquipChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarEquipChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.equipType_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder subBuilder = null;
                            if (this.weapon_ != null) {
                                subBuilder = this.weapon_.toBuilder();
                            }
                            this.weapon_ = input.readMessage(SceneWeaponInfoOuterClass.SceneWeaponInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.weapon_);
                                this.weapon_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.equipGuid_ = input.readUInt64();
                            continue;
                        }
                        case 80: {
                            this.itemId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 98: {
                            SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder subBuilder2 = null;
                            if (this.reliquary_ != null) {
                                subBuilder2 = this.reliquary_.toBuilder();
                            }
                            this.reliquary_ = input.readMessage(SceneReliquaryInfoOuterClass.SceneReliquaryInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.reliquary_);
                                this.reliquary_ = subBuilder2.buildPartial();
                                continue;
                            }
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
            return AvatarEquipChangeNotifyOuterClass.internal_static_AvatarEquipChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarEquipChangeNotifyOuterClass.internal_static_AvatarEquipChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarEquipChangeNotify.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public long getEquipGuid() {
            return this.equipGuid_;
        }
        
        @Override
        public boolean hasReliquary() {
            return this.reliquary_ != null;
        }
        
        @Override
        public SceneReliquaryInfoOuterClass.SceneReliquaryInfo getReliquary() {
            return (this.reliquary_ == null) ? SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance() : this.reliquary_;
        }
        
        @Override
        public SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder getReliquaryOrBuilder() {
            return this.getReliquary();
        }
        
        @Override
        public boolean hasWeapon() {
            return this.weapon_ != null;
        }
        
        @Override
        public SceneWeaponInfoOuterClass.SceneWeaponInfo getWeapon() {
            return (this.weapon_ == null) ? SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance() : this.weapon_;
        }
        
        @Override
        public SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponOrBuilder() {
            return this.getWeapon();
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public int getEquipType() {
            return this.equipType_;
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
            if (this.equipType_ != 0) {
                output.writeUInt32(2, this.equipType_);
            }
            if (this.weapon_ != null) {
                output.writeMessage(4, this.getWeapon());
            }
            if (this.equipGuid_ != 0L) {
                output.writeUInt64(9, this.equipGuid_);
            }
            if (this.itemId_ != 0) {
                output.writeUInt32(10, this.itemId_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(11, this.avatarGuid_);
            }
            if (this.reliquary_ != null) {
                output.writeMessage(12, this.getReliquary());
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
            if (this.equipType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.equipType_);
            }
            if (this.weapon_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getWeapon());
            }
            if (this.equipGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(9, this.equipGuid_);
            }
            if (this.itemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.itemId_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(11, this.avatarGuid_);
            }
            if (this.reliquary_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getReliquary());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarEquipChangeNotify)) {
                return super.equals(obj);
            }
            final AvatarEquipChangeNotify other = (AvatarEquipChangeNotify)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getEquipGuid() == other.getEquipGuid() && this.hasReliquary() == other.hasReliquary() && (!this.hasReliquary() || this.getReliquary().equals(other.getReliquary())) && this.hasWeapon() == other.hasWeapon() && (!this.hasWeapon() || this.getWeapon().equals(other.getWeapon())) && this.getItemId() == other.getItemId() && this.getEquipType() == other.getEquipType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashLong(this.getEquipGuid());
            if (this.hasReliquary()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getReliquary().hashCode();
            }
            if (this.hasWeapon()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getWeapon().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getItemId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getEquipType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarEquipChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarEquipChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarEquipChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarEquipChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarEquipChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarEquipChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarEquipChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEquipChangeNotify.PARSER, input);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEquipChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarEquipChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarEquipChangeNotify.PARSER, input);
        }
        
        public static AvatarEquipChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarEquipChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEquipChangeNotify.PARSER, input);
        }
        
        public static AvatarEquipChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEquipChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarEquipChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarEquipChangeNotify prototype) {
            return AvatarEquipChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarEquipChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarEquipChangeNotify getDefaultInstance() {
            return AvatarEquipChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarEquipChangeNotify> parser() {
            return AvatarEquipChangeNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarEquipChangeNotify> getParserForType() {
            return AvatarEquipChangeNotify.PARSER;
        }
        
        @Override
        public AvatarEquipChangeNotify getDefaultInstanceForType() {
            return AvatarEquipChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarEquipChangeNotify();
            PARSER = new AbstractParser<AvatarEquipChangeNotify>() {
                @Override
                public AvatarEquipChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarEquipChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarEquipChangeNotifyOrBuilder
        {
            private long avatarGuid_;
            private long equipGuid_;
            private SceneReliquaryInfoOuterClass.SceneReliquaryInfo reliquary_;
            private SingleFieldBuilderV3<SceneReliquaryInfoOuterClass.SceneReliquaryInfo, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder, SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> reliquaryBuilder_;
            private SceneWeaponInfoOuterClass.SceneWeaponInfo weapon_;
            private SingleFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> weaponBuilder_;
            private int itemId_;
            private int equipType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarEquipChangeNotifyOuterClass.internal_static_AvatarEquipChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarEquipChangeNotifyOuterClass.internal_static_AvatarEquipChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarEquipChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarEquipChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.equipGuid_ = 0L;
                if (this.reliquaryBuilder_ == null) {
                    this.reliquary_ = null;
                }
                else {
                    this.reliquary_ = null;
                    this.reliquaryBuilder_ = null;
                }
                if (this.weaponBuilder_ == null) {
                    this.weapon_ = null;
                }
                else {
                    this.weapon_ = null;
                    this.weaponBuilder_ = null;
                }
                this.itemId_ = 0;
                this.equipType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarEquipChangeNotifyOuterClass.internal_static_AvatarEquipChangeNotify_descriptor;
            }
            
            @Override
            public AvatarEquipChangeNotify getDefaultInstanceForType() {
                return AvatarEquipChangeNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarEquipChangeNotify build() {
                final AvatarEquipChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarEquipChangeNotify buildPartial() {
                final AvatarEquipChangeNotify result = new AvatarEquipChangeNotify(this);
                result.avatarGuid_ = this.avatarGuid_;
                result.equipGuid_ = this.equipGuid_;
                if (this.reliquaryBuilder_ == null) {
                    result.reliquary_ = this.reliquary_;
                }
                else {
                    result.reliquary_ = this.reliquaryBuilder_.build();
                }
                if (this.weaponBuilder_ == null) {
                    result.weapon_ = this.weapon_;
                }
                else {
                    result.weapon_ = this.weaponBuilder_.build();
                }
                result.itemId_ = this.itemId_;
                result.equipType_ = this.equipType_;
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
                if (other instanceof AvatarEquipChangeNotify) {
                    return this.mergeFrom((AvatarEquipChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarEquipChangeNotify other) {
                if (other == AvatarEquipChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getEquipGuid() != 0L) {
                    this.setEquipGuid(other.getEquipGuid());
                }
                if (other.hasReliquary()) {
                    this.mergeReliquary(other.getReliquary());
                }
                if (other.hasWeapon()) {
                    this.mergeWeapon(other.getWeapon());
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getEquipType() != 0) {
                    this.setEquipType(other.getEquipType());
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
                AvatarEquipChangeNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarEquipChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarEquipChangeNotify)e.getUnfinishedMessage();
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
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getEquipGuid() {
                return this.equipGuid_;
            }
            
            public Builder setEquipGuid(final long value) {
                this.equipGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEquipGuid() {
                this.equipGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasReliquary() {
                return this.reliquaryBuilder_ != null || this.reliquary_ != null;
            }
            
            @Override
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfo getReliquary() {
                if (this.reliquaryBuilder_ == null) {
                    return (this.reliquary_ == null) ? SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance() : this.reliquary_;
                }
                return this.reliquaryBuilder_.getMessage();
            }
            
            public Builder setReliquary(final SceneReliquaryInfoOuterClass.SceneReliquaryInfo value) {
                if (this.reliquaryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.reliquary_ = value;
                    this.onChanged();
                }
                else {
                    this.reliquaryBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setReliquary(final SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder builderForValue) {
                if (this.reliquaryBuilder_ == null) {
                    this.reliquary_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.reliquaryBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeReliquary(final SceneReliquaryInfoOuterClass.SceneReliquaryInfo value) {
                if (this.reliquaryBuilder_ == null) {
                    if (this.reliquary_ != null) {
                        this.reliquary_ = SceneReliquaryInfoOuterClass.SceneReliquaryInfo.newBuilder(this.reliquary_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.reliquary_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.reliquaryBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearReliquary() {
                if (this.reliquaryBuilder_ == null) {
                    this.reliquary_ = null;
                    this.onChanged();
                }
                else {
                    this.reliquary_ = null;
                    this.reliquaryBuilder_ = null;
                }
                return this;
            }
            
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder getReliquaryBuilder() {
                this.onChanged();
                return this.getReliquaryFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder getReliquaryOrBuilder() {
                if (this.reliquaryBuilder_ != null) {
                    return this.reliquaryBuilder_.getMessageOrBuilder();
                }
                return (this.reliquary_ == null) ? SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance() : this.reliquary_;
            }
            
            private SingleFieldBuilderV3<SceneReliquaryInfoOuterClass.SceneReliquaryInfo, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder, SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder> getReliquaryFieldBuilder() {
                if (this.reliquaryBuilder_ == null) {
                    this.reliquaryBuilder_ = new SingleFieldBuilderV3<SceneReliquaryInfoOuterClass.SceneReliquaryInfo, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder, SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder>(this.getReliquary(), this.getParentForChildren(), this.isClean());
                    this.reliquary_ = null;
                }
                return this.reliquaryBuilder_;
            }
            
            @Override
            public boolean hasWeapon() {
                return this.weaponBuilder_ != null || this.weapon_ != null;
            }
            
            @Override
            public SceneWeaponInfoOuterClass.SceneWeaponInfo getWeapon() {
                if (this.weaponBuilder_ == null) {
                    return (this.weapon_ == null) ? SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance() : this.weapon_;
                }
                return this.weaponBuilder_.getMessage();
            }
            
            public Builder setWeapon(final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.weapon_ = value;
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWeapon(final SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder builderForValue) {
                if (this.weaponBuilder_ == null) {
                    this.weapon_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWeapon(final SceneWeaponInfoOuterClass.SceneWeaponInfo value) {
                if (this.weaponBuilder_ == null) {
                    if (this.weapon_ != null) {
                        this.weapon_ = SceneWeaponInfoOuterClass.SceneWeaponInfo.newBuilder(this.weapon_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.weapon_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWeapon() {
                if (this.weaponBuilder_ == null) {
                    this.weapon_ = null;
                    this.onChanged();
                }
                else {
                    this.weapon_ = null;
                    this.weaponBuilder_ = null;
                }
                return this;
            }
            
            public SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder getWeaponBuilder() {
                this.onChanged();
                return this.getWeaponFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponOrBuilder() {
                if (this.weaponBuilder_ != null) {
                    return this.weaponBuilder_.getMessageOrBuilder();
                }
                return (this.weapon_ == null) ? SceneWeaponInfoOuterClass.SceneWeaponInfo.getDefaultInstance() : this.weapon_;
            }
            
            private SingleFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder> getWeaponFieldBuilder() {
                if (this.weaponBuilder_ == null) {
                    this.weaponBuilder_ = new SingleFieldBuilderV3<SceneWeaponInfoOuterClass.SceneWeaponInfo, SceneWeaponInfoOuterClass.SceneWeaponInfo.Builder, SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder>(this.getWeapon(), this.getParentForChildren(), this.isClean());
                    this.weapon_ = null;
                }
                return this.weaponBuilder_;
            }
            
            @Override
            public int getItemId() {
                return this.itemId_;
            }
            
            public Builder setItemId(final int value) {
                this.itemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemId() {
                this.itemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEquipType() {
                return this.equipType_;
            }
            
            public Builder setEquipType(final int value) {
                this.equipType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEquipType() {
                this.equipType_ = 0;
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
    
    public interface AvatarEquipChangeNotifyOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        long getEquipGuid();
        
        boolean hasReliquary();
        
        SceneReliquaryInfoOuterClass.SceneReliquaryInfo getReliquary();
        
        SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder getReliquaryOrBuilder();
        
        boolean hasWeapon();
        
        SceneWeaponInfoOuterClass.SceneWeaponInfo getWeapon();
        
        SceneWeaponInfoOuterClass.SceneWeaponInfoOrBuilder getWeaponOrBuilder();
        
        int getItemId();
        
        int getEquipType();
    }
}
