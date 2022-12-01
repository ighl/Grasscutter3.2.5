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

public final class AbilitySyncStateInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilitySyncStateInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilitySyncStateInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilitySyncStateInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilitySyncStateInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aAbilitySyncStateInfo.proto\u001a\u001bAbilityAppliedAbility.proto\u001a\u001cAbilityAppliedModifier.proto\u001a\u001dAbilityMixinRecoverInfo.proto\u001a\u001dAbilityScalarValueEntry.proto\"µ\u0002\n\u0014AbilitySyncStateInfo\u0012\u0011\n\tis_inited\u0018\u0001 \u0001(\b\u00123\n\u0011dynamic_value_map\u0018\u0002 \u0003(\u000b2\u0018.AbilityScalarValueEntry\u00121\n\u0011applied_abilities\u0018\u0003 \u0003(\u000b2\u0016.AbilityAppliedAbility\u00122\n\u0011applied_modifiers\u0018\u0004 \u0003(\u000b2\u0017.AbilityAppliedModifier\u00125\n\u0013mixin_recover_infos\u0018\u0005 \u0003(\u000b2\u0018.AbilityMixinRecoverInfo\u00127\n\u0015sgv_dynamic_value_map\u0018\u0006 \u0003(\u000b2\u0018.AbilityScalarValueEntryB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilitySyncStateInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityAppliedAbilityOuterClass.getDescriptor(), AbilityAppliedModifierOuterClass.getDescriptor(), AbilityMixinRecoverInfoOuterClass.getDescriptor(), AbilityScalarValueEntryOuterClass.getDescriptor() });
        internal_static_AbilitySyncStateInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilitySyncStateInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilitySyncStateInfoOuterClass.internal_static_AbilitySyncStateInfo_descriptor, new String[] { "IsInited", "DynamicValueMap", "AppliedAbilities", "AppliedModifiers", "MixinRecoverInfos", "SgvDynamicValueMap" });
        AbilityAppliedAbilityOuterClass.getDescriptor();
        AbilityAppliedModifierOuterClass.getDescriptor();
        AbilityMixinRecoverInfoOuterClass.getDescriptor();
        AbilityScalarValueEntryOuterClass.getDescriptor();
    }
    
    public static final class AbilitySyncStateInfo extends GeneratedMessageV3 implements AbilitySyncStateInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_INITED_FIELD_NUMBER = 1;
        private boolean isInited_;
        public static final int DYNAMIC_VALUE_MAP_FIELD_NUMBER = 2;
        private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> dynamicValueMap_;
        public static final int APPLIED_ABILITIES_FIELD_NUMBER = 3;
        private List<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility> appliedAbilities_;
        public static final int APPLIED_MODIFIERS_FIELD_NUMBER = 4;
        private List<AbilityAppliedModifierOuterClass.AbilityAppliedModifier> appliedModifiers_;
        public static final int MIXIN_RECOVER_INFOS_FIELD_NUMBER = 5;
        private List<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo> mixinRecoverInfos_;
        public static final int SGV_DYNAMIC_VALUE_MAP_FIELD_NUMBER = 6;
        private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> sgvDynamicValueMap_;
        private byte memoizedIsInitialized;
        private static final AbilitySyncStateInfo DEFAULT_INSTANCE;
        private static final Parser<AbilitySyncStateInfo> PARSER;
        
        private AbilitySyncStateInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilitySyncStateInfo() {
            this.memoizedIsInitialized = -1;
            this.dynamicValueMap_ = Collections.emptyList();
            this.appliedAbilities_ = Collections.emptyList();
            this.appliedModifiers_ = Collections.emptyList();
            this.mixinRecoverInfos_ = Collections.emptyList();
            this.sgvDynamicValueMap_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilitySyncStateInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilitySyncStateInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isInited_ = input.readBool();
                            continue;
                        }
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.dynamicValueMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.dynamicValueMap_.add(input.readMessage(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parser(), extensionRegistry));
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.appliedAbilities_ = new ArrayList<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.appliedAbilities_.add(input.readMessage(AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.parser(), extensionRegistry));
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.appliedModifiers_ = new ArrayList<AbilityAppliedModifierOuterClass.AbilityAppliedModifier>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.appliedModifiers_.add(input.readMessage(AbilityAppliedModifierOuterClass.AbilityAppliedModifier.parser(), extensionRegistry));
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.mixinRecoverInfos_ = new ArrayList<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.mixinRecoverInfos_.add(input.readMessage(AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.sgvDynamicValueMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.sgvDynamicValueMap_.add(input.readMessage(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parser(), extensionRegistry));
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
                    this.dynamicValueMap_ = Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.dynamicValueMap_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.appliedAbilities_ = Collections.unmodifiableList((List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbility>)this.appliedAbilities_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.appliedModifiers_ = Collections.unmodifiableList((List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifier>)this.appliedModifiers_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.mixinRecoverInfos_ = Collections.unmodifiableList((List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo>)this.mixinRecoverInfos_);
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.sgvDynamicValueMap_ = Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.sgvDynamicValueMap_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilitySyncStateInfoOuterClass.internal_static_AbilitySyncStateInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilitySyncStateInfoOuterClass.internal_static_AbilitySyncStateInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilitySyncStateInfo.class, Builder.class);
        }
        
        @Override
        public boolean getIsInited() {
            return this.isInited_;
        }
        
        @Override
        public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getDynamicValueMapList() {
            return this.dynamicValueMap_;
        }
        
        @Override
        public List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getDynamicValueMapOrBuilderList() {
            return this.dynamicValueMap_;
        }
        
        @Override
        public int getDynamicValueMapCount() {
            return this.dynamicValueMap_.size();
        }
        
        @Override
        public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getDynamicValueMap(final int index) {
            return this.dynamicValueMap_.get(index);
        }
        
        @Override
        public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getDynamicValueMapOrBuilder(final int index) {
            return this.dynamicValueMap_.get(index);
        }
        
        @Override
        public List<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility> getAppliedAbilitiesList() {
            return this.appliedAbilities_;
        }
        
        @Override
        public List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> getAppliedAbilitiesOrBuilderList() {
            return this.appliedAbilities_;
        }
        
        @Override
        public int getAppliedAbilitiesCount() {
            return this.appliedAbilities_.size();
        }
        
        @Override
        public AbilityAppliedAbilityOuterClass.AbilityAppliedAbility getAppliedAbilities(final int index) {
            return this.appliedAbilities_.get(index);
        }
        
        @Override
        public AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder getAppliedAbilitiesOrBuilder(final int index) {
            return this.appliedAbilities_.get(index);
        }
        
        @Override
        public List<AbilityAppliedModifierOuterClass.AbilityAppliedModifier> getAppliedModifiersList() {
            return this.appliedModifiers_;
        }
        
        @Override
        public List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder> getAppliedModifiersOrBuilderList() {
            return this.appliedModifiers_;
        }
        
        @Override
        public int getAppliedModifiersCount() {
            return this.appliedModifiers_.size();
        }
        
        @Override
        public AbilityAppliedModifierOuterClass.AbilityAppliedModifier getAppliedModifiers(final int index) {
            return this.appliedModifiers_.get(index);
        }
        
        @Override
        public AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder getAppliedModifiersOrBuilder(final int index) {
            return this.appliedModifiers_.get(index);
        }
        
        @Override
        public List<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo> getMixinRecoverInfosList() {
            return this.mixinRecoverInfos_;
        }
        
        @Override
        public List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder> getMixinRecoverInfosOrBuilderList() {
            return this.mixinRecoverInfos_;
        }
        
        @Override
        public int getMixinRecoverInfosCount() {
            return this.mixinRecoverInfos_.size();
        }
        
        @Override
        public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo getMixinRecoverInfos(final int index) {
            return this.mixinRecoverInfos_.get(index);
        }
        
        @Override
        public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder getMixinRecoverInfosOrBuilder(final int index) {
            return this.mixinRecoverInfos_.get(index);
        }
        
        @Override
        public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getSgvDynamicValueMapList() {
            return this.sgvDynamicValueMap_;
        }
        
        @Override
        public List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getSgvDynamicValueMapOrBuilderList() {
            return this.sgvDynamicValueMap_;
        }
        
        @Override
        public int getSgvDynamicValueMapCount() {
            return this.sgvDynamicValueMap_.size();
        }
        
        @Override
        public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getSgvDynamicValueMap(final int index) {
            return this.sgvDynamicValueMap_.get(index);
        }
        
        @Override
        public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getSgvDynamicValueMapOrBuilder(final int index) {
            return this.sgvDynamicValueMap_.get(index);
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
            if (this.isInited_) {
                output.writeBool(1, this.isInited_);
            }
            for (int i = 0; i < this.dynamicValueMap_.size(); ++i) {
                output.writeMessage(2, this.dynamicValueMap_.get(i));
            }
            for (int i = 0; i < this.appliedAbilities_.size(); ++i) {
                output.writeMessage(3, this.appliedAbilities_.get(i));
            }
            for (int i = 0; i < this.appliedModifiers_.size(); ++i) {
                output.writeMessage(4, this.appliedModifiers_.get(i));
            }
            for (int i = 0; i < this.mixinRecoverInfos_.size(); ++i) {
                output.writeMessage(5, this.mixinRecoverInfos_.get(i));
            }
            for (int i = 0; i < this.sgvDynamicValueMap_.size(); ++i) {
                output.writeMessage(6, this.sgvDynamicValueMap_.get(i));
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
            if (this.isInited_) {
                size += CodedOutputStream.computeBoolSize(1, this.isInited_);
            }
            for (int i = 0; i < this.dynamicValueMap_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.dynamicValueMap_.get(i));
            }
            for (int i = 0; i < this.appliedAbilities_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.appliedAbilities_.get(i));
            }
            for (int i = 0; i < this.appliedModifiers_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.appliedModifiers_.get(i));
            }
            for (int i = 0; i < this.mixinRecoverInfos_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.mixinRecoverInfos_.get(i));
            }
            for (int i = 0; i < this.sgvDynamicValueMap_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.sgvDynamicValueMap_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilitySyncStateInfo)) {
                return super.equals(obj);
            }
            final AbilitySyncStateInfo other = (AbilitySyncStateInfo)obj;
            return this.getIsInited() == other.getIsInited() && this.getDynamicValueMapList().equals(other.getDynamicValueMapList()) && this.getAppliedAbilitiesList().equals(other.getAppliedAbilitiesList()) && this.getAppliedModifiersList().equals(other.getAppliedModifiersList()) && this.getMixinRecoverInfosList().equals(other.getMixinRecoverInfosList()) && this.getSgvDynamicValueMapList().equals(other.getSgvDynamicValueMapList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInited());
            if (this.getDynamicValueMapCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getDynamicValueMapList().hashCode();
            }
            if (this.getAppliedAbilitiesCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getAppliedAbilitiesList().hashCode();
            }
            if (this.getAppliedModifiersCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getAppliedModifiersList().hashCode();
            }
            if (this.getMixinRecoverInfosCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getMixinRecoverInfosList().hashCode();
            }
            if (this.getSgvDynamicValueMapCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getSgvDynamicValueMapList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilitySyncStateInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilitySyncStateInfo.PARSER.parseFrom(data);
        }
        
        public static AbilitySyncStateInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilitySyncStateInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilitySyncStateInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilitySyncStateInfo.PARSER.parseFrom(data);
        }
        
        public static AbilitySyncStateInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilitySyncStateInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilitySyncStateInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilitySyncStateInfo.PARSER.parseFrom(data);
        }
        
        public static AbilitySyncStateInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilitySyncStateInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilitySyncStateInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilitySyncStateInfo.PARSER, input);
        }
        
        public static AbilitySyncStateInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilitySyncStateInfo.PARSER, input, extensionRegistry);
        }
        
        public static AbilitySyncStateInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilitySyncStateInfo.PARSER, input);
        }
        
        public static AbilitySyncStateInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilitySyncStateInfo.PARSER, input, extensionRegistry);
        }
        
        public static AbilitySyncStateInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilitySyncStateInfo.PARSER, input);
        }
        
        public static AbilitySyncStateInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilitySyncStateInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilitySyncStateInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilitySyncStateInfo prototype) {
            return AbilitySyncStateInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilitySyncStateInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilitySyncStateInfo getDefaultInstance() {
            return AbilitySyncStateInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilitySyncStateInfo> parser() {
            return AbilitySyncStateInfo.PARSER;
        }
        
        @Override
        public Parser<AbilitySyncStateInfo> getParserForType() {
            return AbilitySyncStateInfo.PARSER;
        }
        
        @Override
        public AbilitySyncStateInfo getDefaultInstanceForType() {
            return AbilitySyncStateInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilitySyncStateInfo();
            PARSER = new AbstractParser<AbilitySyncStateInfo>() {
                @Override
                public AbilitySyncStateInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilitySyncStateInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilitySyncStateInfoOrBuilder
        {
            private int bitField0_;
            private boolean isInited_;
            private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> dynamicValueMap_;
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> dynamicValueMapBuilder_;
            private List<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility> appliedAbilities_;
            private RepeatedFieldBuilderV3<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility, AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder, AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> appliedAbilitiesBuilder_;
            private List<AbilityAppliedModifierOuterClass.AbilityAppliedModifier> appliedModifiers_;
            private RepeatedFieldBuilderV3<AbilityAppliedModifierOuterClass.AbilityAppliedModifier, AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder, AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder> appliedModifiersBuilder_;
            private List<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo> mixinRecoverInfos_;
            private RepeatedFieldBuilderV3<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder> mixinRecoverInfosBuilder_;
            private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> sgvDynamicValueMap_;
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> sgvDynamicValueMapBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilitySyncStateInfoOuterClass.internal_static_AbilitySyncStateInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilitySyncStateInfoOuterClass.internal_static_AbilitySyncStateInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilitySyncStateInfo.class, Builder.class);
            }
            
            private Builder() {
                this.dynamicValueMap_ = Collections.emptyList();
                this.appliedAbilities_ = Collections.emptyList();
                this.appliedModifiers_ = Collections.emptyList();
                this.mixinRecoverInfos_ = Collections.emptyList();
                this.sgvDynamicValueMap_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.dynamicValueMap_ = Collections.emptyList();
                this.appliedAbilities_ = Collections.emptyList();
                this.appliedModifiers_ = Collections.emptyList();
                this.mixinRecoverInfos_ = Collections.emptyList();
                this.sgvDynamicValueMap_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilitySyncStateInfo.alwaysUseFieldBuilders) {
                    this.getDynamicValueMapFieldBuilder();
                    this.getAppliedAbilitiesFieldBuilder();
                    this.getAppliedModifiersFieldBuilder();
                    this.getMixinRecoverInfosFieldBuilder();
                    this.getSgvDynamicValueMapFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isInited_ = false;
                if (this.dynamicValueMapBuilder_ == null) {
                    this.dynamicValueMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.dynamicValueMapBuilder_.clear();
                }
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.appliedAbilities_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.appliedAbilitiesBuilder_.clear();
                }
                if (this.appliedModifiersBuilder_ == null) {
                    this.appliedModifiers_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.appliedModifiersBuilder_.clear();
                }
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.mixinRecoverInfos_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.mixinRecoverInfosBuilder_.clear();
                }
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.sgvDynamicValueMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                else {
                    this.sgvDynamicValueMapBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilitySyncStateInfoOuterClass.internal_static_AbilitySyncStateInfo_descriptor;
            }
            
            @Override
            public AbilitySyncStateInfo getDefaultInstanceForType() {
                return AbilitySyncStateInfo.getDefaultInstance();
            }
            
            @Override
            public AbilitySyncStateInfo build() {
                final AbilitySyncStateInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilitySyncStateInfo buildPartial() {
                final AbilitySyncStateInfo result = new AbilitySyncStateInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.isInited_ = this.isInited_;
                if (this.dynamicValueMapBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.dynamicValueMap_ = Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.dynamicValueMap_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.dynamicValueMap_ = this.dynamicValueMap_;
                }
                else {
                    result.dynamicValueMap_ = this.dynamicValueMapBuilder_.build();
                }
                if (this.appliedAbilitiesBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.appliedAbilities_ = Collections.unmodifiableList((List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbility>)this.appliedAbilities_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.appliedAbilities_ = this.appliedAbilities_;
                }
                else {
                    result.appliedAbilities_ = this.appliedAbilitiesBuilder_.build();
                }
                if (this.appliedModifiersBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.appliedModifiers_ = Collections.unmodifiableList((List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifier>)this.appliedModifiers_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.appliedModifiers_ = this.appliedModifiers_;
                }
                else {
                    result.appliedModifiers_ = this.appliedModifiersBuilder_.build();
                }
                if (this.mixinRecoverInfosBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.mixinRecoverInfos_ = Collections.unmodifiableList((List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo>)this.mixinRecoverInfos_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.mixinRecoverInfos_ = this.mixinRecoverInfos_;
                }
                else {
                    result.mixinRecoverInfos_ = this.mixinRecoverInfosBuilder_.build();
                }
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) != 0x0) {
                        this.sgvDynamicValueMap_ = Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.sgvDynamicValueMap_);
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    result.sgvDynamicValueMap_ = this.sgvDynamicValueMap_;
                }
                else {
                    result.sgvDynamicValueMap_ = this.sgvDynamicValueMapBuilder_.build();
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
                if (other instanceof AbilitySyncStateInfo) {
                    return this.mergeFrom((AbilitySyncStateInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilitySyncStateInfo other) {
                if (other == AbilitySyncStateInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsInited()) {
                    this.setIsInited(other.getIsInited());
                }
                if (this.dynamicValueMapBuilder_ == null) {
                    if (!other.dynamicValueMap_.isEmpty()) {
                        if (this.dynamicValueMap_.isEmpty()) {
                            this.dynamicValueMap_ = other.dynamicValueMap_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureDynamicValueMapIsMutable();
                            this.dynamicValueMap_.addAll(other.dynamicValueMap_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.dynamicValueMap_.isEmpty()) {
                    if (this.dynamicValueMapBuilder_.isEmpty()) {
                        this.dynamicValueMapBuilder_.dispose();
                        this.dynamicValueMapBuilder_ = null;
                        this.dynamicValueMap_ = other.dynamicValueMap_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.dynamicValueMapBuilder_ = (AbilitySyncStateInfo.alwaysUseFieldBuilders ? this.getDynamicValueMapFieldBuilder() : null);
                    }
                    else {
                        this.dynamicValueMapBuilder_.addAllMessages(other.dynamicValueMap_);
                    }
                }
                if (this.appliedAbilitiesBuilder_ == null) {
                    if (!other.appliedAbilities_.isEmpty()) {
                        if (this.appliedAbilities_.isEmpty()) {
                            this.appliedAbilities_ = other.appliedAbilities_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureAppliedAbilitiesIsMutable();
                            this.appliedAbilities_.addAll(other.appliedAbilities_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.appliedAbilities_.isEmpty()) {
                    if (this.appliedAbilitiesBuilder_.isEmpty()) {
                        this.appliedAbilitiesBuilder_.dispose();
                        this.appliedAbilitiesBuilder_ = null;
                        this.appliedAbilities_ = other.appliedAbilities_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.appliedAbilitiesBuilder_ = (AbilitySyncStateInfo.alwaysUseFieldBuilders ? this.getAppliedAbilitiesFieldBuilder() : null);
                    }
                    else {
                        this.appliedAbilitiesBuilder_.addAllMessages(other.appliedAbilities_);
                    }
                }
                if (this.appliedModifiersBuilder_ == null) {
                    if (!other.appliedModifiers_.isEmpty()) {
                        if (this.appliedModifiers_.isEmpty()) {
                            this.appliedModifiers_ = other.appliedModifiers_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureAppliedModifiersIsMutable();
                            this.appliedModifiers_.addAll(other.appliedModifiers_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.appliedModifiers_.isEmpty()) {
                    if (this.appliedModifiersBuilder_.isEmpty()) {
                        this.appliedModifiersBuilder_.dispose();
                        this.appliedModifiersBuilder_ = null;
                        this.appliedModifiers_ = other.appliedModifiers_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.appliedModifiersBuilder_ = (AbilitySyncStateInfo.alwaysUseFieldBuilders ? this.getAppliedModifiersFieldBuilder() : null);
                    }
                    else {
                        this.appliedModifiersBuilder_.addAllMessages(other.appliedModifiers_);
                    }
                }
                if (this.mixinRecoverInfosBuilder_ == null) {
                    if (!other.mixinRecoverInfos_.isEmpty()) {
                        if (this.mixinRecoverInfos_.isEmpty()) {
                            this.mixinRecoverInfos_ = other.mixinRecoverInfos_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureMixinRecoverInfosIsMutable();
                            this.mixinRecoverInfos_.addAll(other.mixinRecoverInfos_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.mixinRecoverInfos_.isEmpty()) {
                    if (this.mixinRecoverInfosBuilder_.isEmpty()) {
                        this.mixinRecoverInfosBuilder_.dispose();
                        this.mixinRecoverInfosBuilder_ = null;
                        this.mixinRecoverInfos_ = other.mixinRecoverInfos_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.mixinRecoverInfosBuilder_ = (AbilitySyncStateInfo.alwaysUseFieldBuilders ? this.getMixinRecoverInfosFieldBuilder() : null);
                    }
                    else {
                        this.mixinRecoverInfosBuilder_.addAllMessages(other.mixinRecoverInfos_);
                    }
                }
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    if (!other.sgvDynamicValueMap_.isEmpty()) {
                        if (this.sgvDynamicValueMap_.isEmpty()) {
                            this.sgvDynamicValueMap_ = other.sgvDynamicValueMap_;
                            this.bitField0_ &= 0xFFFFFFEF;
                        }
                        else {
                            this.ensureSgvDynamicValueMapIsMutable();
                            this.sgvDynamicValueMap_.addAll(other.sgvDynamicValueMap_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.sgvDynamicValueMap_.isEmpty()) {
                    if (this.sgvDynamicValueMapBuilder_.isEmpty()) {
                        this.sgvDynamicValueMapBuilder_.dispose();
                        this.sgvDynamicValueMapBuilder_ = null;
                        this.sgvDynamicValueMap_ = other.sgvDynamicValueMap_;
                        this.bitField0_ &= 0xFFFFFFEF;
                        this.sgvDynamicValueMapBuilder_ = (AbilitySyncStateInfo.alwaysUseFieldBuilders ? this.getSgvDynamicValueMapFieldBuilder() : null);
                    }
                    else {
                        this.sgvDynamicValueMapBuilder_.addAllMessages(other.sgvDynamicValueMap_);
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
                AbilitySyncStateInfo parsedMessage = null;
                try {
                    parsedMessage = AbilitySyncStateInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilitySyncStateInfo)e.getUnfinishedMessage();
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
            public boolean getIsInited() {
                return this.isInited_;
            }
            
            public Builder setIsInited(final boolean value) {
                this.isInited_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInited() {
                this.isInited_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureDynamicValueMapIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.dynamicValueMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>(this.dynamicValueMap_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getDynamicValueMapList() {
                if (this.dynamicValueMapBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.dynamicValueMap_);
                }
                return this.dynamicValueMapBuilder_.getMessageList();
            }
            
            @Override
            public int getDynamicValueMapCount() {
                if (this.dynamicValueMapBuilder_ == null) {
                    return this.dynamicValueMap_.size();
                }
                return this.dynamicValueMapBuilder_.getCount();
            }
            
            @Override
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getDynamicValueMap(final int index) {
                if (this.dynamicValueMapBuilder_ == null) {
                    return this.dynamicValueMap_.get(index);
                }
                return this.dynamicValueMapBuilder_.getMessage(index);
            }
            
            public Builder setDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.dynamicValueMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDynamicValueMap(final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.dynamicValueMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.add(value);
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.dynamicValueMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDynamicValueMap(final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDynamicValueMap(final Iterable<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> values) {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.ensureDynamicValueMapIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.dynamicValueMap_);
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDynamicValueMap() {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.dynamicValueMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDynamicValueMap(final int index) {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.ensureDynamicValueMapIsMutable();
                    this.dynamicValueMap_.remove(index);
                    this.onChanged();
                }
                else {
                    this.dynamicValueMapBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder getDynamicValueMapBuilder(final int index) {
                return this.getDynamicValueMapFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getDynamicValueMapOrBuilder(final int index) {
                if (this.dynamicValueMapBuilder_ == null) {
                    return this.dynamicValueMap_.get(index);
                }
                return this.dynamicValueMapBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getDynamicValueMapOrBuilderList() {
                if (this.dynamicValueMapBuilder_ != null) {
                    return this.dynamicValueMapBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>)this.dynamicValueMap_);
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addDynamicValueMapBuilder() {
                return this.getDynamicValueMapFieldBuilder().addBuilder(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addDynamicValueMapBuilder(final int index) {
                return this.getDynamicValueMapFieldBuilder().addBuilder(index, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
            }
            
            public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder> getDynamicValueMapBuilderList() {
                return this.getDynamicValueMapFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getDynamicValueMapFieldBuilder() {
                if (this.dynamicValueMapBuilder_ == null) {
                    this.dynamicValueMapBuilder_ = new RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>(this.dynamicValueMap_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.dynamicValueMap_ = null;
                }
                return this.dynamicValueMapBuilder_;
            }
            
            private void ensureAppliedAbilitiesIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.appliedAbilities_ = new ArrayList<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility>(this.appliedAbilities_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility> getAppliedAbilitiesList() {
                if (this.appliedAbilitiesBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbility>)this.appliedAbilities_);
                }
                return this.appliedAbilitiesBuilder_.getMessageList();
            }
            
            @Override
            public int getAppliedAbilitiesCount() {
                if (this.appliedAbilitiesBuilder_ == null) {
                    return this.appliedAbilities_.size();
                }
                return this.appliedAbilitiesBuilder_.getCount();
            }
            
            @Override
            public AbilityAppliedAbilityOuterClass.AbilityAppliedAbility getAppliedAbilities(final int index) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    return this.appliedAbilities_.get(index);
                }
                return this.appliedAbilitiesBuilder_.getMessage(index);
            }
            
            public Builder setAppliedAbilities(final int index, final AbilityAppliedAbilityOuterClass.AbilityAppliedAbility value) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAppliedAbilities(final int index, final AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder builderForValue) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAppliedAbilities(final AbilityAppliedAbilityOuterClass.AbilityAppliedAbility value) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.add(value);
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAppliedAbilities(final int index, final AbilityAppliedAbilityOuterClass.AbilityAppliedAbility value) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAppliedAbilities(final AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder builderForValue) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAppliedAbilities(final int index, final AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder builderForValue) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAppliedAbilities(final Iterable<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbility> values) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.ensureAppliedAbilitiesIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.appliedAbilities_);
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAppliedAbilities() {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.appliedAbilities_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAppliedAbilities(final int index) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.ensureAppliedAbilitiesIsMutable();
                    this.appliedAbilities_.remove(index);
                    this.onChanged();
                }
                else {
                    this.appliedAbilitiesBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder getAppliedAbilitiesBuilder(final int index) {
                return this.getAppliedAbilitiesFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder getAppliedAbilitiesOrBuilder(final int index) {
                if (this.appliedAbilitiesBuilder_ == null) {
                    return this.appliedAbilities_.get(index);
                }
                return this.appliedAbilitiesBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> getAppliedAbilitiesOrBuilderList() {
                if (this.appliedAbilitiesBuilder_ != null) {
                    return this.appliedAbilitiesBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder>)this.appliedAbilities_);
            }
            
            public AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder addAppliedAbilitiesBuilder() {
                return this.getAppliedAbilitiesFieldBuilder().addBuilder(AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.getDefaultInstance());
            }
            
            public AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder addAppliedAbilitiesBuilder(final int index) {
                return this.getAppliedAbilitiesFieldBuilder().addBuilder(index, AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.getDefaultInstance());
            }
            
            public List<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder> getAppliedAbilitiesBuilderList() {
                return this.getAppliedAbilitiesFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility, AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder, AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> getAppliedAbilitiesFieldBuilder() {
                if (this.appliedAbilitiesBuilder_ == null) {
                    this.appliedAbilitiesBuilder_ = new RepeatedFieldBuilderV3<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility, AbilityAppliedAbilityOuterClass.AbilityAppliedAbility.Builder, AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder>(this.appliedAbilities_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.appliedAbilities_ = null;
                }
                return this.appliedAbilitiesBuilder_;
            }
            
            private void ensureAppliedModifiersIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.appliedModifiers_ = new ArrayList<AbilityAppliedModifierOuterClass.AbilityAppliedModifier>(this.appliedModifiers_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<AbilityAppliedModifierOuterClass.AbilityAppliedModifier> getAppliedModifiersList() {
                if (this.appliedModifiersBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifier>)this.appliedModifiers_);
                }
                return this.appliedModifiersBuilder_.getMessageList();
            }
            
            @Override
            public int getAppliedModifiersCount() {
                if (this.appliedModifiersBuilder_ == null) {
                    return this.appliedModifiers_.size();
                }
                return this.appliedModifiersBuilder_.getCount();
            }
            
            @Override
            public AbilityAppliedModifierOuterClass.AbilityAppliedModifier getAppliedModifiers(final int index) {
                if (this.appliedModifiersBuilder_ == null) {
                    return this.appliedModifiers_.get(index);
                }
                return this.appliedModifiersBuilder_.getMessage(index);
            }
            
            public Builder setAppliedModifiers(final int index, final AbilityAppliedModifierOuterClass.AbilityAppliedModifier value) {
                if (this.appliedModifiersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAppliedModifiers(final int index, final AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder builderForValue) {
                if (this.appliedModifiersBuilder_ == null) {
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAppliedModifiers(final AbilityAppliedModifierOuterClass.AbilityAppliedModifier value) {
                if (this.appliedModifiersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.add(value);
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAppliedModifiers(final int index, final AbilityAppliedModifierOuterClass.AbilityAppliedModifier value) {
                if (this.appliedModifiersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAppliedModifiers(final AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder builderForValue) {
                if (this.appliedModifiersBuilder_ == null) {
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAppliedModifiers(final int index, final AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder builderForValue) {
                if (this.appliedModifiersBuilder_ == null) {
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAppliedModifiers(final Iterable<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifier> values) {
                if (this.appliedModifiersBuilder_ == null) {
                    this.ensureAppliedModifiersIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.appliedModifiers_);
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAppliedModifiers() {
                if (this.appliedModifiersBuilder_ == null) {
                    this.appliedModifiers_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAppliedModifiers(final int index) {
                if (this.appliedModifiersBuilder_ == null) {
                    this.ensureAppliedModifiersIsMutable();
                    this.appliedModifiers_.remove(index);
                    this.onChanged();
                }
                else {
                    this.appliedModifiersBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder getAppliedModifiersBuilder(final int index) {
                return this.getAppliedModifiersFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder getAppliedModifiersOrBuilder(final int index) {
                if (this.appliedModifiersBuilder_ == null) {
                    return this.appliedModifiers_.get(index);
                }
                return this.appliedModifiersBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder> getAppliedModifiersOrBuilderList() {
                if (this.appliedModifiersBuilder_ != null) {
                    return this.appliedModifiersBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder>)this.appliedModifiers_);
            }
            
            public AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder addAppliedModifiersBuilder() {
                return this.getAppliedModifiersFieldBuilder().addBuilder(AbilityAppliedModifierOuterClass.AbilityAppliedModifier.getDefaultInstance());
            }
            
            public AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder addAppliedModifiersBuilder(final int index) {
                return this.getAppliedModifiersFieldBuilder().addBuilder(index, AbilityAppliedModifierOuterClass.AbilityAppliedModifier.getDefaultInstance());
            }
            
            public List<AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder> getAppliedModifiersBuilderList() {
                return this.getAppliedModifiersFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityAppliedModifierOuterClass.AbilityAppliedModifier, AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder, AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder> getAppliedModifiersFieldBuilder() {
                if (this.appliedModifiersBuilder_ == null) {
                    this.appliedModifiersBuilder_ = new RepeatedFieldBuilderV3<AbilityAppliedModifierOuterClass.AbilityAppliedModifier, AbilityAppliedModifierOuterClass.AbilityAppliedModifier.Builder, AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder>(this.appliedModifiers_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.appliedModifiers_ = null;
                }
                return this.appliedModifiersBuilder_;
            }
            
            private void ensureMixinRecoverInfosIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.mixinRecoverInfos_ = new ArrayList<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo>(this.mixinRecoverInfos_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo> getMixinRecoverInfosList() {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo>)this.mixinRecoverInfos_);
                }
                return this.mixinRecoverInfosBuilder_.getMessageList();
            }
            
            @Override
            public int getMixinRecoverInfosCount() {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    return this.mixinRecoverInfos_.size();
                }
                return this.mixinRecoverInfosBuilder_.getCount();
            }
            
            @Override
            public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo getMixinRecoverInfos(final int index) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    return this.mixinRecoverInfos_.get(index);
                }
                return this.mixinRecoverInfosBuilder_.getMessage(index);
            }
            
            public Builder setMixinRecoverInfos(final int index, final AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo value) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMixinRecoverInfos(final int index, final AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder builderForValue) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMixinRecoverInfos(final AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo value) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.add(value);
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMixinRecoverInfos(final int index, final AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo value) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMixinRecoverInfos(final AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder builderForValue) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMixinRecoverInfos(final int index, final AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder builderForValue) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMixinRecoverInfos(final Iterable<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo> values) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.ensureMixinRecoverInfosIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.mixinRecoverInfos_);
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMixinRecoverInfos() {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.mixinRecoverInfos_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMixinRecoverInfos(final int index) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.ensureMixinRecoverInfosIsMutable();
                    this.mixinRecoverInfos_.remove(index);
                    this.onChanged();
                }
                else {
                    this.mixinRecoverInfosBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder getMixinRecoverInfosBuilder(final int index) {
                return this.getMixinRecoverInfosFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder getMixinRecoverInfosOrBuilder(final int index) {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    return this.mixinRecoverInfos_.get(index);
                }
                return this.mixinRecoverInfosBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder> getMixinRecoverInfosOrBuilderList() {
                if (this.mixinRecoverInfosBuilder_ != null) {
                    return this.mixinRecoverInfosBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder>)this.mixinRecoverInfos_);
            }
            
            public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder addMixinRecoverInfosBuilder() {
                return this.getMixinRecoverInfosFieldBuilder().addBuilder(AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.getDefaultInstance());
            }
            
            public AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder addMixinRecoverInfosBuilder(final int index) {
                return this.getMixinRecoverInfosFieldBuilder().addBuilder(index, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.getDefaultInstance());
            }
            
            public List<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder> getMixinRecoverInfosBuilderList() {
                return this.getMixinRecoverInfosFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder> getMixinRecoverInfosFieldBuilder() {
                if (this.mixinRecoverInfosBuilder_ == null) {
                    this.mixinRecoverInfosBuilder_ = new RepeatedFieldBuilderV3<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo.Builder, AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder>(this.mixinRecoverInfos_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.mixinRecoverInfos_ = null;
                }
                return this.mixinRecoverInfosBuilder_;
            }
            
            private void ensureSgvDynamicValueMapIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.sgvDynamicValueMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>(this.sgvDynamicValueMap_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getSgvDynamicValueMapList() {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.sgvDynamicValueMap_);
                }
                return this.sgvDynamicValueMapBuilder_.getMessageList();
            }
            
            @Override
            public int getSgvDynamicValueMapCount() {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    return this.sgvDynamicValueMap_.size();
                }
                return this.sgvDynamicValueMapBuilder_.getCount();
            }
            
            @Override
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getSgvDynamicValueMap(final int index) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    return this.sgvDynamicValueMap_.get(index);
                }
                return this.sgvDynamicValueMapBuilder_.getMessage(index);
            }
            
            public Builder setSgvDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSgvDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSgvDynamicValueMap(final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.add(value);
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSgvDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSgvDynamicValueMap(final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSgvDynamicValueMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSgvDynamicValueMap(final Iterable<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> values) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.ensureSgvDynamicValueMapIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.sgvDynamicValueMap_);
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSgvDynamicValueMap() {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.sgvDynamicValueMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSgvDynamicValueMap(final int index) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.ensureSgvDynamicValueMapIsMutable();
                    this.sgvDynamicValueMap_.remove(index);
                    this.onChanged();
                }
                else {
                    this.sgvDynamicValueMapBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder getSgvDynamicValueMapBuilder(final int index) {
                return this.getSgvDynamicValueMapFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getSgvDynamicValueMapOrBuilder(final int index) {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    return this.sgvDynamicValueMap_.get(index);
                }
                return this.sgvDynamicValueMapBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getSgvDynamicValueMapOrBuilderList() {
                if (this.sgvDynamicValueMapBuilder_ != null) {
                    return this.sgvDynamicValueMapBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>)this.sgvDynamicValueMap_);
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addSgvDynamicValueMapBuilder() {
                return this.getSgvDynamicValueMapFieldBuilder().addBuilder(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addSgvDynamicValueMapBuilder(final int index) {
                return this.getSgvDynamicValueMapFieldBuilder().addBuilder(index, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
            }
            
            public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder> getSgvDynamicValueMapBuilderList() {
                return this.getSgvDynamicValueMapFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getSgvDynamicValueMapFieldBuilder() {
                if (this.sgvDynamicValueMapBuilder_ == null) {
                    this.sgvDynamicValueMapBuilder_ = new RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>(this.sgvDynamicValueMap_, (this.bitField0_ & 0x10) != 0x0, this.getParentForChildren(), this.isClean());
                    this.sgvDynamicValueMap_ = null;
                }
                return this.sgvDynamicValueMapBuilder_;
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
    
    public interface AbilitySyncStateInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsInited();
        
        List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getDynamicValueMapList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getDynamicValueMap(final int p0);
        
        int getDynamicValueMapCount();
        
        List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getDynamicValueMapOrBuilderList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getDynamicValueMapOrBuilder(final int p0);
        
        List<AbilityAppliedAbilityOuterClass.AbilityAppliedAbility> getAppliedAbilitiesList();
        
        AbilityAppliedAbilityOuterClass.AbilityAppliedAbility getAppliedAbilities(final int p0);
        
        int getAppliedAbilitiesCount();
        
        List<? extends AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder> getAppliedAbilitiesOrBuilderList();
        
        AbilityAppliedAbilityOuterClass.AbilityAppliedAbilityOrBuilder getAppliedAbilitiesOrBuilder(final int p0);
        
        List<AbilityAppliedModifierOuterClass.AbilityAppliedModifier> getAppliedModifiersList();
        
        AbilityAppliedModifierOuterClass.AbilityAppliedModifier getAppliedModifiers(final int p0);
        
        int getAppliedModifiersCount();
        
        List<? extends AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder> getAppliedModifiersOrBuilderList();
        
        AbilityAppliedModifierOuterClass.AbilityAppliedModifierOrBuilder getAppliedModifiersOrBuilder(final int p0);
        
        List<AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo> getMixinRecoverInfosList();
        
        AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfo getMixinRecoverInfos(final int p0);
        
        int getMixinRecoverInfosCount();
        
        List<? extends AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder> getMixinRecoverInfosOrBuilderList();
        
        AbilityMixinRecoverInfoOuterClass.AbilityMixinRecoverInfoOrBuilder getMixinRecoverInfosOrBuilder(final int p0);
        
        List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getSgvDynamicValueMapList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getSgvDynamicValueMap(final int p0);
        
        int getSgvDynamicValueMapCount();
        
        List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getSgvDynamicValueMapOrBuilderList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getSgvDynamicValueMapOrBuilder(final int p0);
    }
}
