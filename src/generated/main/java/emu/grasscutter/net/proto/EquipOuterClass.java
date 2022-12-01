// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
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

public final class EquipOuterClass
{
    private static final Descriptors.Descriptor internal_static_Equip_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Equip_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EquipOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EquipOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000bEquip.proto\u001a\u000fReliquary.proto\u001a\fWeapon.proto\"`\n\u0005Equip\u0012\u0011\n\tis_locked\u0018\u0003 \u0001(\b\u0012\u001f\n\treliquary\u0018\u0001 \u0001(\u000b2\n.ReliquaryH\u0000\u0012\u0019\n\u0006weapon\u0018\u0002 \u0001(\u000b2\u0007.WeaponH\u0000B\b\n\u0006detailB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EquipOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ReliquaryOuterClass.getDescriptor(), WeaponOuterClass.getDescriptor() });
        internal_static_Equip_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Equip_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EquipOuterClass.internal_static_Equip_descriptor, new String[] { "IsLocked", "Reliquary", "Weapon", "Detail" });
        ReliquaryOuterClass.getDescriptor();
        WeaponOuterClass.getDescriptor();
    }
    
    public static final class Equip extends GeneratedMessageV3 implements EquipOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int detailCase_;
        private Object detail_;
        public static final int IS_LOCKED_FIELD_NUMBER = 3;
        private boolean isLocked_;
        public static final int RELIQUARY_FIELD_NUMBER = 1;
        public static final int WEAPON_FIELD_NUMBER = 2;
        private byte memoizedIsInitialized;
        private static final Equip DEFAULT_INSTANCE;
        private static final Parser<Equip> PARSER;
        
        private Equip(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private Equip() {
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Equip();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Equip(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            ReliquaryOuterClass.Reliquary.Builder subBuilder = null;
                            if (this.detailCase_ == 1) {
                                subBuilder = ((ReliquaryOuterClass.Reliquary)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(ReliquaryOuterClass.Reliquary.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((ReliquaryOuterClass.Reliquary)this.detail_);
                                this.detail_ = subBuilder.buildPartial();
                            }
                            this.detailCase_ = 1;
                            continue;
                        }
                        case 18: {
                            WeaponOuterClass.Weapon.Builder subBuilder2 = null;
                            if (this.detailCase_ == 2) {
                                subBuilder2 = ((WeaponOuterClass.Weapon)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(WeaponOuterClass.Weapon.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((WeaponOuterClass.Weapon)this.detail_);
                                this.detail_ = subBuilder2.buildPartial();
                            }
                            this.detailCase_ = 2;
                            continue;
                        }
                        case 24: {
                            this.isLocked_ = input.readBool();
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
            return EquipOuterClass.internal_static_Equip_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipOuterClass.internal_static_Equip_fieldAccessorTable.ensureFieldAccessorsInitialized(Equip.class, Builder.class);
        }
        
        @Override
        public DetailCase getDetailCase() {
            return DetailCase.forNumber(this.detailCase_);
        }
        
        @Override
        public boolean getIsLocked() {
            return this.isLocked_;
        }
        
        @Override
        public boolean hasReliquary() {
            return this.detailCase_ == 1;
        }
        
        @Override
        public ReliquaryOuterClass.Reliquary getReliquary() {
            if (this.detailCase_ == 1) {
                return (ReliquaryOuterClass.Reliquary)this.detail_;
            }
            return ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
        
        @Override
        public ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
            if (this.detailCase_ == 1) {
                return (ReliquaryOuterClass.Reliquary)this.detail_;
            }
            return ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
        
        @Override
        public boolean hasWeapon() {
            return this.detailCase_ == 2;
        }
        
        @Override
        public WeaponOuterClass.Weapon getWeapon() {
            if (this.detailCase_ == 2) {
                return (WeaponOuterClass.Weapon)this.detail_;
            }
            return WeaponOuterClass.Weapon.getDefaultInstance();
        }
        
        @Override
        public WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
            if (this.detailCase_ == 2) {
                return (WeaponOuterClass.Weapon)this.detail_;
            }
            return WeaponOuterClass.Weapon.getDefaultInstance();
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
            if (this.detailCase_ == 1) {
                output.writeMessage(1, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 2) {
                output.writeMessage(2, (MessageLite)this.detail_);
            }
            if (this.isLocked_) {
                output.writeBool(3, this.isLocked_);
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
            if (this.detailCase_ == 1) {
                size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 2) {
                size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.detail_);
            }
            if (this.isLocked_) {
                size += CodedOutputStream.computeBoolSize(3, this.isLocked_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Equip)) {
                return super.equals(obj);
            }
            final Equip other = (Equip)obj;
            if (this.getIsLocked() != other.getIsLocked()) {
                return false;
            }
            if (!this.getDetailCase().equals(other.getDetailCase())) {
                return false;
            }
            switch (this.detailCase_) {
                case 1: {
                    if (!this.getReliquary().equals(other.getReliquary())) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    if (!this.getWeapon().equals(other.getWeapon())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsLocked());
            switch (this.detailCase_) {
                case 1: {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getReliquary().hashCode();
                    break;
                }
                case 2: {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getWeapon().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Equip parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Equip.PARSER.parseFrom(data);
        }
        
        public static Equip parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Equip.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Equip parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Equip.PARSER.parseFrom(data);
        }
        
        public static Equip parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Equip.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Equip parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Equip.PARSER.parseFrom(data);
        }
        
        public static Equip parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Equip.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Equip parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Equip.PARSER, input);
        }
        
        public static Equip parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Equip.PARSER, input, extensionRegistry);
        }
        
        public static Equip parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Equip.PARSER, input);
        }
        
        public static Equip parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Equip.PARSER, input, extensionRegistry);
        }
        
        public static Equip parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Equip.PARSER, input);
        }
        
        public static Equip parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Equip.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Equip.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Equip prototype) {
            return Equip.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Equip.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Equip getDefaultInstance() {
            return Equip.DEFAULT_INSTANCE;
        }
        
        public static Parser<Equip> parser() {
            return Equip.PARSER;
        }
        
        @Override
        public Parser<Equip> getParserForType() {
            return Equip.PARSER;
        }
        
        @Override
        public Equip getDefaultInstanceForType() {
            return Equip.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Equip();
            PARSER = new AbstractParser<Equip>() {
                @Override
                public Equip parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Equip(input, extensionRegistry);
                }
            };
        }
        
        public enum DetailCase implements Internal.EnumLite, InternalOneOfEnum
        {
            RELIQUARY(1), 
            WEAPON(2), 
            DETAIL_NOT_SET(0);
            
            private final int value;
            
            private DetailCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static DetailCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DetailCase forNumber(final int value) {
                switch (value) {
                    case 1: {
                        return DetailCase.RELIQUARY;
                    }
                    case 2: {
                        return DetailCase.WEAPON;
                    }
                    case 0: {
                        return DetailCase.DETAIL_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ DetailCase[] value() {
                return new DetailCase[] { DetailCase.RELIQUARY, DetailCase.WEAPON, DetailCase.DETAIL_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EquipOrBuilder
        {
            private int detailCase_;
            private Object detail_;
            private boolean isLocked_;
            private SingleFieldBuilderV3<ReliquaryOuterClass.Reliquary, ReliquaryOuterClass.Reliquary.Builder, ReliquaryOuterClass.ReliquaryOrBuilder> reliquaryBuilder_;
            private SingleFieldBuilderV3<WeaponOuterClass.Weapon, WeaponOuterClass.Weapon.Builder, WeaponOuterClass.WeaponOrBuilder> weaponBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EquipOuterClass.internal_static_Equip_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EquipOuterClass.internal_static_Equip_fieldAccessorTable.ensureFieldAccessorsInitialized(Equip.class, Builder.class);
            }
            
            private Builder() {
                this.detailCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.detailCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Equip.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isLocked_ = false;
                this.detailCase_ = 0;
                this.detail_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EquipOuterClass.internal_static_Equip_descriptor;
            }
            
            @Override
            public Equip getDefaultInstanceForType() {
                return Equip.getDefaultInstance();
            }
            
            @Override
            public Equip build() {
                final Equip result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Equip buildPartial() {
                final Equip result = new Equip(this);
                result.isLocked_ = this.isLocked_;
                if (this.detailCase_ == 1) {
                    if (this.reliquaryBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.reliquaryBuilder_.build();
                    }
                }
                if (this.detailCase_ == 2) {
                    if (this.weaponBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.weaponBuilder_.build();
                    }
                }
                result.detailCase_ = this.detailCase_;
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
                if (other instanceof Equip) {
                    return this.mergeFrom((Equip)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Equip other) {
                if (other == Equip.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsLocked()) {
                    this.setIsLocked(other.getIsLocked());
                }
                switch (other.getDetailCase()) {
                    case RELIQUARY: {
                        this.mergeReliquary(other.getReliquary());
                        break;
                    }
                    case WEAPON: {
                        this.mergeWeapon(other.getWeapon());
                        break;
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
                Equip parsedMessage = null;
                try {
                    parsedMessage = Equip.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Equip)e.getUnfinishedMessage();
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
            public DetailCase getDetailCase() {
                return DetailCase.forNumber(this.detailCase_);
            }
            
            public Builder clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsLocked() {
                return this.isLocked_;
            }
            
            public Builder setIsLocked(final boolean value) {
                this.isLocked_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsLocked() {
                this.isLocked_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasReliquary() {
                return this.detailCase_ == 1;
            }
            
            @Override
            public ReliquaryOuterClass.Reliquary getReliquary() {
                if (this.reliquaryBuilder_ == null) {
                    if (this.detailCase_ == 1) {
                        return (ReliquaryOuterClass.Reliquary)this.detail_;
                    }
                    return ReliquaryOuterClass.Reliquary.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1) {
                        return this.reliquaryBuilder_.getMessage();
                    }
                    return ReliquaryOuterClass.Reliquary.getDefaultInstance();
                }
            }
            
            public Builder setReliquary(final ReliquaryOuterClass.Reliquary value) {
                if (this.reliquaryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.reliquaryBuilder_.setMessage(value);
                }
                this.detailCase_ = 1;
                return this;
            }
            
            public Builder setReliquary(final ReliquaryOuterClass.Reliquary.Builder builderForValue) {
                if (this.reliquaryBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.reliquaryBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1;
                return this;
            }
            
            public Builder mergeReliquary(final ReliquaryOuterClass.Reliquary value) {
                if (this.reliquaryBuilder_ == null) {
                    if (this.detailCase_ == 1 && this.detail_ != ReliquaryOuterClass.Reliquary.getDefaultInstance()) {
                        this.detail_ = ReliquaryOuterClass.Reliquary.newBuilder((ReliquaryOuterClass.Reliquary)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1) {
                        this.reliquaryBuilder_.mergeFrom(value);
                    }
                    this.reliquaryBuilder_.setMessage(value);
                }
                this.detailCase_ = 1;
                return this;
            }
            
            public Builder clearReliquary() {
                if (this.reliquaryBuilder_ == null) {
                    if (this.detailCase_ == 1) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.reliquaryBuilder_.clear();
                }
                return this;
            }
            
            public ReliquaryOuterClass.Reliquary.Builder getReliquaryBuilder() {
                return this.getReliquaryFieldBuilder().getBuilder();
            }
            
            @Override
            public ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
                if (this.detailCase_ == 1 && this.reliquaryBuilder_ != null) {
                    return this.reliquaryBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1) {
                    return (ReliquaryOuterClass.Reliquary)this.detail_;
                }
                return ReliquaryOuterClass.Reliquary.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ReliquaryOuterClass.Reliquary, ReliquaryOuterClass.Reliquary.Builder, ReliquaryOuterClass.ReliquaryOrBuilder> getReliquaryFieldBuilder() {
                if (this.reliquaryBuilder_ == null) {
                    if (this.detailCase_ != 1) {
                        this.detail_ = ReliquaryOuterClass.Reliquary.getDefaultInstance();
                    }
                    this.reliquaryBuilder_ = new SingleFieldBuilderV3<ReliquaryOuterClass.Reliquary, ReliquaryOuterClass.Reliquary.Builder, ReliquaryOuterClass.ReliquaryOrBuilder>((ReliquaryOuterClass.Reliquary)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1;
                this.onChanged();
                return this.reliquaryBuilder_;
            }
            
            @Override
            public boolean hasWeapon() {
                return this.detailCase_ == 2;
            }
            
            @Override
            public WeaponOuterClass.Weapon getWeapon() {
                if (this.weaponBuilder_ == null) {
                    if (this.detailCase_ == 2) {
                        return (WeaponOuterClass.Weapon)this.detail_;
                    }
                    return WeaponOuterClass.Weapon.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 2) {
                        return this.weaponBuilder_.getMessage();
                    }
                    return WeaponOuterClass.Weapon.getDefaultInstance();
                }
            }
            
            public Builder setWeapon(final WeaponOuterClass.Weapon value) {
                if (this.weaponBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.setMessage(value);
                }
                this.detailCase_ = 2;
                return this;
            }
            
            public Builder setWeapon(final WeaponOuterClass.Weapon.Builder builderForValue) {
                if (this.weaponBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weaponBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 2;
                return this;
            }
            
            public Builder mergeWeapon(final WeaponOuterClass.Weapon value) {
                if (this.weaponBuilder_ == null) {
                    if (this.detailCase_ == 2 && this.detail_ != WeaponOuterClass.Weapon.getDefaultInstance()) {
                        this.detail_ = WeaponOuterClass.Weapon.newBuilder((WeaponOuterClass.Weapon)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 2) {
                        this.weaponBuilder_.mergeFrom(value);
                    }
                    this.weaponBuilder_.setMessage(value);
                }
                this.detailCase_ = 2;
                return this;
            }
            
            public Builder clearWeapon() {
                if (this.weaponBuilder_ == null) {
                    if (this.detailCase_ == 2) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 2) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.weaponBuilder_.clear();
                }
                return this;
            }
            
            public WeaponOuterClass.Weapon.Builder getWeaponBuilder() {
                return this.getWeaponFieldBuilder().getBuilder();
            }
            
            @Override
            public WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
                if (this.detailCase_ == 2 && this.weaponBuilder_ != null) {
                    return this.weaponBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 2) {
                    return (WeaponOuterClass.Weapon)this.detail_;
                }
                return WeaponOuterClass.Weapon.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WeaponOuterClass.Weapon, WeaponOuterClass.Weapon.Builder, WeaponOuterClass.WeaponOrBuilder> getWeaponFieldBuilder() {
                if (this.weaponBuilder_ == null) {
                    if (this.detailCase_ != 2) {
                        this.detail_ = WeaponOuterClass.Weapon.getDefaultInstance();
                    }
                    this.weaponBuilder_ = new SingleFieldBuilderV3<WeaponOuterClass.Weapon, WeaponOuterClass.Weapon.Builder, WeaponOuterClass.WeaponOrBuilder>((WeaponOuterClass.Weapon)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 2;
                this.onChanged();
                return this.weaponBuilder_;
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
    
    public interface EquipOrBuilder extends MessageOrBuilder
    {
        boolean getIsLocked();
        
        boolean hasReliquary();
        
        ReliquaryOuterClass.Reliquary getReliquary();
        
        ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder();
        
        boolean hasWeapon();
        
        WeaponOuterClass.Weapon getWeapon();
        
        WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder();
        
        Equip.DetailCase getDetailCase();
    }
}
