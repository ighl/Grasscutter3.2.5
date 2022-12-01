// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
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

public final class AbilityMixinRecoverInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityMixinRecoverInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityMixinRecoverInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityMixinRecoverInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityMixinRecoverInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAbilityMixinRecoverInfo.proto\u001a\u0019MassivePropSyncInfo.proto\"\u00da\u0001\n\u0017AbilityMixinRecoverInfo\u0012\u0010\n\blocal_id\u0018\u0003 \u0001(\r\u0012\u0011\n\tdata_list\u0018\u0004 \u0003(\r\u0012\u001e\n\u0016is_serverbuff_modifier\u0018\u0005 \u0001(\b\u0012/\n\u0011massive_prop_list\u0018\u0006 \u0003(\u000b2\u0014.MassivePropSyncInfo\u0012\u001e\n\u0014instanced_ability_id\u0018\u0001 \u0001(\rH\u0000\u0012\u001f\n\u0015instanced_modifier_id\u0018\u0002 \u0001(\rH\u0000B\b\n\u0006sourceB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityMixinRecoverInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MassivePropSyncInfoOuterClass.getDescriptor() });
        internal_static_AbilityMixinRecoverInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityMixinRecoverInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityMixinRecoverInfoOuterClass.internal_static_AbilityMixinRecoverInfo_descriptor, new String[] { "LocalId", "DataList", "IsServerbuffModifier", "MassivePropList", "InstancedAbilityId", "InstancedModifierId", "Source" });
        MassivePropSyncInfoOuterClass.getDescriptor();
    }
    
    public static final class AbilityMixinRecoverInfo extends GeneratedMessageV3 implements AbilityMixinRecoverInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int sourceCase_;
        private Object source_;
        public static final int LOCAL_ID_FIELD_NUMBER = 3;
        private int localId_;
        public static final int DATA_LIST_FIELD_NUMBER = 4;
        private Internal.IntList dataList_;
        private int dataListMemoizedSerializedSize;
        public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 5;
        private boolean isServerbuffModifier_;
        public static final int MASSIVE_PROP_LIST_FIELD_NUMBER = 6;
        private List<MassivePropSyncInfoOuterClass.MassivePropSyncInfo> massivePropList_;
        public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 1;
        public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 2;
        private byte memoizedIsInitialized;
        private static final AbilityMixinRecoverInfo DEFAULT_INSTANCE;
        private static final Parser<AbilityMixinRecoverInfo> PARSER;
        
        private AbilityMixinRecoverInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sourceCase_ = 0;
            this.dataListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityMixinRecoverInfo() {
            this.sourceCase_ = 0;
            this.dataListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.dataList_ = GeneratedMessageV3.emptyIntList();
            this.massivePropList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityMixinRecoverInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityMixinRecoverInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.sourceCase_ = 1;
                            this.source_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.sourceCase_ = 2;
                            this.source_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.localId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.dataList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.dataList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.dataList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.dataList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            this.isServerbuffModifier_ = input.readBool();
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.massivePropList_ = new ArrayList<MassivePropSyncInfoOuterClass.MassivePropSyncInfo>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.massivePropList_.add(input.readMessage(MassivePropSyncInfoOuterClass.MassivePropSyncInfo.parser(), extensionRegistry));
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
                    this.dataList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.massivePropList_ = Collections.unmodifiableList((List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfo>)this.massivePropList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityMixinRecoverInfoOuterClass.internal_static_AbilityMixinRecoverInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityMixinRecoverInfoOuterClass.internal_static_AbilityMixinRecoverInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMixinRecoverInfo.class, Builder.class);
        }
        
        @Override
        public SourceCase getSourceCase() {
            return SourceCase.forNumber(this.sourceCase_);
        }
        
        @Override
        public int getLocalId() {
            return this.localId_;
        }
        
        @Override
        public List<Integer> getDataListList() {
            return this.dataList_;
        }
        
        @Override
        public int getDataListCount() {
            return this.dataList_.size();
        }
        
        @Override
        public int getDataList(final int index) {
            return this.dataList_.getInt(index);
        }
        
        @Override
        public boolean getIsServerbuffModifier() {
            return this.isServerbuffModifier_;
        }
        
        @Override
        public List<MassivePropSyncInfoOuterClass.MassivePropSyncInfo> getMassivePropListList() {
            return this.massivePropList_;
        }
        
        @Override
        public List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder> getMassivePropListOrBuilderList() {
            return this.massivePropList_;
        }
        
        @Override
        public int getMassivePropListCount() {
            return this.massivePropList_.size();
        }
        
        @Override
        public MassivePropSyncInfoOuterClass.MassivePropSyncInfo getMassivePropList(final int index) {
            return this.massivePropList_.get(index);
        }
        
        @Override
        public MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder getMassivePropListOrBuilder(final int index) {
            return this.massivePropList_.get(index);
        }
        
        @Override
        public boolean hasInstancedAbilityId() {
            return this.sourceCase_ == 1;
        }
        
        @Override
        public int getInstancedAbilityId() {
            if (this.sourceCase_ == 1) {
                return (int)this.source_;
            }
            return 0;
        }
        
        @Override
        public boolean hasInstancedModifierId() {
            return this.sourceCase_ == 2;
        }
        
        @Override
        public int getInstancedModifierId() {
            if (this.sourceCase_ == 2) {
                return (int)this.source_;
            }
            return 0;
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
            if (this.sourceCase_ == 1) {
                output.writeUInt32(1, (int)this.source_);
            }
            if (this.sourceCase_ == 2) {
                output.writeUInt32(2, (int)this.source_);
            }
            if (this.localId_ != 0) {
                output.writeUInt32(3, this.localId_);
            }
            if (this.getDataListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.dataListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.dataList_.size(); ++i) {
                output.writeUInt32NoTag(this.dataList_.getInt(i));
            }
            if (this.isServerbuffModifier_) {
                output.writeBool(5, this.isServerbuffModifier_);
            }
            for (int i = 0; i < this.massivePropList_.size(); ++i) {
                output.writeMessage(6, this.massivePropList_.get(i));
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
            if (this.sourceCase_ == 1) {
                size += CodedOutputStream.computeUInt32Size(1, (int)this.source_);
            }
            if (this.sourceCase_ == 2) {
                size += CodedOutputStream.computeUInt32Size(2, (int)this.source_);
            }
            if (this.localId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.localId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.dataList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.dataList_.getInt(i));
            }
            size += dataSize;
            if (!this.getDataListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.dataListMemoizedSerializedSize = dataSize;
            if (this.isServerbuffModifier_) {
                size += CodedOutputStream.computeBoolSize(5, this.isServerbuffModifier_);
            }
            for (int j = 0; j < this.massivePropList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(6, this.massivePropList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityMixinRecoverInfo)) {
                return super.equals(obj);
            }
            final AbilityMixinRecoverInfo other = (AbilityMixinRecoverInfo)obj;
            if (this.getLocalId() != other.getLocalId()) {
                return false;
            }
            if (!this.getDataListList().equals(other.getDataListList())) {
                return false;
            }
            if (this.getIsServerbuffModifier() != other.getIsServerbuffModifier()) {
                return false;
            }
            if (!this.getMassivePropListList().equals(other.getMassivePropListList())) {
                return false;
            }
            if (!this.getSourceCase().equals(other.getSourceCase())) {
                return false;
            }
            switch (this.sourceCase_) {
                case 1: {
                    if (this.getInstancedAbilityId() != other.getInstancedAbilityId()) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    if (this.getInstancedModifierId() != other.getInstancedModifierId()) {
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
            hash = 53 * hash + this.getLocalId();
            if (this.getDataListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getDataListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsServerbuffModifier());
            if (this.getMassivePropListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getMassivePropListList().hashCode();
            }
            switch (this.sourceCase_) {
                case 1: {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getInstancedAbilityId();
                    break;
                }
                case 2: {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getInstancedModifierId();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityMixinRecoverInfo.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinRecoverInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityMixinRecoverInfo.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinRecoverInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityMixinRecoverInfo.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinRecoverInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinRecoverInfo.PARSER, input);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinRecoverInfo.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMixinRecoverInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMixinRecoverInfo.PARSER, input);
        }
        
        public static AbilityMixinRecoverInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMixinRecoverInfo.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinRecoverInfo.PARSER, input);
        }
        
        public static AbilityMixinRecoverInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinRecoverInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityMixinRecoverInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityMixinRecoverInfo prototype) {
            return AbilityMixinRecoverInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityMixinRecoverInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityMixinRecoverInfo getDefaultInstance() {
            return AbilityMixinRecoverInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityMixinRecoverInfo> parser() {
            return AbilityMixinRecoverInfo.PARSER;
        }
        
        @Override
        public Parser<AbilityMixinRecoverInfo> getParserForType() {
            return AbilityMixinRecoverInfo.PARSER;
        }
        
        @Override
        public AbilityMixinRecoverInfo getDefaultInstanceForType() {
            return AbilityMixinRecoverInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityMixinRecoverInfo();
            PARSER = new AbstractParser<AbilityMixinRecoverInfo>() {
                @Override
                public AbilityMixinRecoverInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityMixinRecoverInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum SourceCase implements Internal.EnumLite, InternalOneOfEnum
        {
            INSTANCED_ABILITY_ID(1), 
            INSTANCED_MODIFIER_ID(2), 
            SOURCE_NOT_SET(0);
            
            private final int value;
            
            private SourceCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static SourceCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static SourceCase forNumber(final int value) {
                switch (value) {
                    case 1: {
                        return SourceCase.INSTANCED_ABILITY_ID;
                    }
                    case 2: {
                        return SourceCase.INSTANCED_MODIFIER_ID;
                    }
                    case 0: {
                        return SourceCase.SOURCE_NOT_SET;
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
            
            private static /* synthetic */ SourceCase[] value() {
                return new SourceCase[] { SourceCase.INSTANCED_ABILITY_ID, SourceCase.INSTANCED_MODIFIER_ID, SourceCase.SOURCE_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityMixinRecoverInfoOrBuilder
        {
            private int sourceCase_;
            private Object source_;
            private int bitField0_;
            private int localId_;
            private Internal.IntList dataList_;
            private boolean isServerbuffModifier_;
            private List<MassivePropSyncInfoOuterClass.MassivePropSyncInfo> massivePropList_;
            private RepeatedFieldBuilderV3<MassivePropSyncInfoOuterClass.MassivePropSyncInfo, MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder, MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder> massivePropListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityMixinRecoverInfoOuterClass.internal_static_AbilityMixinRecoverInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityMixinRecoverInfoOuterClass.internal_static_AbilityMixinRecoverInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMixinRecoverInfo.class, Builder.class);
            }
            
            private Builder() {
                this.sourceCase_ = 0;
                this.dataList_ = GeneratedMessageV3.emptyIntList();
                this.massivePropList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.sourceCase_ = 0;
                this.dataList_ = GeneratedMessageV3.emptyIntList();
                this.massivePropList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityMixinRecoverInfo.alwaysUseFieldBuilders) {
                    this.getMassivePropListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.localId_ = 0;
                this.dataList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.isServerbuffModifier_ = false;
                if (this.massivePropListBuilder_ == null) {
                    this.massivePropList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.massivePropListBuilder_.clear();
                }
                this.sourceCase_ = 0;
                this.source_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityMixinRecoverInfoOuterClass.internal_static_AbilityMixinRecoverInfo_descriptor;
            }
            
            @Override
            public AbilityMixinRecoverInfo getDefaultInstanceForType() {
                return AbilityMixinRecoverInfo.getDefaultInstance();
            }
            
            @Override
            public AbilityMixinRecoverInfo build() {
                final AbilityMixinRecoverInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityMixinRecoverInfo buildPartial() {
                final AbilityMixinRecoverInfo result = new AbilityMixinRecoverInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.localId_ = this.localId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.dataList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.dataList_ = this.dataList_;
                result.isServerbuffModifier_ = this.isServerbuffModifier_;
                if (this.massivePropListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.massivePropList_ = Collections.unmodifiableList((List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfo>)this.massivePropList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.massivePropList_ = this.massivePropList_;
                }
                else {
                    result.massivePropList_ = this.massivePropListBuilder_.build();
                }
                if (this.sourceCase_ == 1) {
                    result.source_ = this.source_;
                }
                if (this.sourceCase_ == 2) {
                    result.source_ = this.source_;
                }
                result.sourceCase_ = this.sourceCase_;
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
                if (other instanceof AbilityMixinRecoverInfo) {
                    return this.mergeFrom((AbilityMixinRecoverInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityMixinRecoverInfo other) {
                if (other == AbilityMixinRecoverInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getLocalId() != 0) {
                    this.setLocalId(other.getLocalId());
                }
                if (!other.dataList_.isEmpty()) {
                    if (this.dataList_.isEmpty()) {
                        this.dataList_ = other.dataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureDataListIsMutable();
                        this.dataList_.addAll(other.dataList_);
                    }
                    this.onChanged();
                }
                if (other.getIsServerbuffModifier()) {
                    this.setIsServerbuffModifier(other.getIsServerbuffModifier());
                }
                if (this.massivePropListBuilder_ == null) {
                    if (!other.massivePropList_.isEmpty()) {
                        if (this.massivePropList_.isEmpty()) {
                            this.massivePropList_ = other.massivePropList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureMassivePropListIsMutable();
                            this.massivePropList_.addAll(other.massivePropList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.massivePropList_.isEmpty()) {
                    if (this.massivePropListBuilder_.isEmpty()) {
                        this.massivePropListBuilder_.dispose();
                        this.massivePropListBuilder_ = null;
                        this.massivePropList_ = other.massivePropList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.massivePropListBuilder_ = (AbilityMixinRecoverInfo.alwaysUseFieldBuilders ? this.getMassivePropListFieldBuilder() : null);
                    }
                    else {
                        this.massivePropListBuilder_.addAllMessages(other.massivePropList_);
                    }
                }
                switch (other.getSourceCase()) {
                    case INSTANCED_ABILITY_ID: {
                        this.setInstancedAbilityId(other.getInstancedAbilityId());
                        break;
                    }
                    case INSTANCED_MODIFIER_ID: {
                        this.setInstancedModifierId(other.getInstancedModifierId());
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
                AbilityMixinRecoverInfo parsedMessage = null;
                try {
                    parsedMessage = AbilityMixinRecoverInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityMixinRecoverInfo)e.getUnfinishedMessage();
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
            public SourceCase getSourceCase() {
                return SourceCase.forNumber(this.sourceCase_);
            }
            
            public Builder clearSource() {
                this.sourceCase_ = 0;
                this.source_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLocalId() {
                return this.localId_;
            }
            
            public Builder setLocalId(final int value) {
                this.localId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLocalId() {
                this.localId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.dataList_ = GeneratedMessageV3.mutableCopy(this.dataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getDataListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.dataList_) : this.dataList_;
            }
            
            @Override
            public int getDataListCount() {
                return this.dataList_.size();
            }
            
            @Override
            public int getDataList(final int index) {
                return this.dataList_.getInt(index);
            }
            
            public Builder setDataList(final int index, final int value) {
                this.ensureDataListIsMutable();
                this.dataList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDataList(final int value) {
                this.ensureDataListIsMutable();
                this.dataList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDataList(final Iterable<? extends Integer> values) {
                this.ensureDataListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.dataList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDataList() {
                this.dataList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsServerbuffModifier() {
                return this.isServerbuffModifier_;
            }
            
            public Builder setIsServerbuffModifier(final boolean value) {
                this.isServerbuffModifier_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsServerbuffModifier() {
                this.isServerbuffModifier_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureMassivePropListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.massivePropList_ = new ArrayList<MassivePropSyncInfoOuterClass.MassivePropSyncInfo>(this.massivePropList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<MassivePropSyncInfoOuterClass.MassivePropSyncInfo> getMassivePropListList() {
                if (this.massivePropListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfo>)this.massivePropList_);
                }
                return this.massivePropListBuilder_.getMessageList();
            }
            
            @Override
            public int getMassivePropListCount() {
                if (this.massivePropListBuilder_ == null) {
                    return this.massivePropList_.size();
                }
                return this.massivePropListBuilder_.getCount();
            }
            
            @Override
            public MassivePropSyncInfoOuterClass.MassivePropSyncInfo getMassivePropList(final int index) {
                if (this.massivePropListBuilder_ == null) {
                    return this.massivePropList_.get(index);
                }
                return this.massivePropListBuilder_.getMessage(index);
            }
            
            public Builder setMassivePropList(final int index, final MassivePropSyncInfoOuterClass.MassivePropSyncInfo value) {
                if (this.massivePropListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMassivePropList(final int index, final MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder builderForValue) {
                if (this.massivePropListBuilder_ == null) {
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMassivePropList(final MassivePropSyncInfoOuterClass.MassivePropSyncInfo value) {
                if (this.massivePropListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.add(value);
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMassivePropList(final int index, final MassivePropSyncInfoOuterClass.MassivePropSyncInfo value) {
                if (this.massivePropListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMassivePropList(final MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder builderForValue) {
                if (this.massivePropListBuilder_ == null) {
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMassivePropList(final int index, final MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder builderForValue) {
                if (this.massivePropListBuilder_ == null) {
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMassivePropList(final Iterable<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfo> values) {
                if (this.massivePropListBuilder_ == null) {
                    this.ensureMassivePropListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.massivePropList_);
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMassivePropList() {
                if (this.massivePropListBuilder_ == null) {
                    this.massivePropList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMassivePropList(final int index) {
                if (this.massivePropListBuilder_ == null) {
                    this.ensureMassivePropListIsMutable();
                    this.massivePropList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.massivePropListBuilder_.remove(index);
                }
                return this;
            }
            
            public MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder getMassivePropListBuilder(final int index) {
                return this.getMassivePropListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder getMassivePropListOrBuilder(final int index) {
                if (this.massivePropListBuilder_ == null) {
                    return this.massivePropList_.get(index);
                }
                return this.massivePropListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder> getMassivePropListOrBuilderList() {
                if (this.massivePropListBuilder_ != null) {
                    return this.massivePropListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder>)this.massivePropList_);
            }
            
            public MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder addMassivePropListBuilder() {
                return this.getMassivePropListFieldBuilder().addBuilder(MassivePropSyncInfoOuterClass.MassivePropSyncInfo.getDefaultInstance());
            }
            
            public MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder addMassivePropListBuilder(final int index) {
                return this.getMassivePropListFieldBuilder().addBuilder(index, MassivePropSyncInfoOuterClass.MassivePropSyncInfo.getDefaultInstance());
            }
            
            public List<MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder> getMassivePropListBuilderList() {
                return this.getMassivePropListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MassivePropSyncInfoOuterClass.MassivePropSyncInfo, MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder, MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder> getMassivePropListFieldBuilder() {
                if (this.massivePropListBuilder_ == null) {
                    this.massivePropListBuilder_ = new RepeatedFieldBuilderV3<MassivePropSyncInfoOuterClass.MassivePropSyncInfo, MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder, MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder>(this.massivePropList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.massivePropList_ = null;
                }
                return this.massivePropListBuilder_;
            }
            
            @Override
            public boolean hasInstancedAbilityId() {
                return this.sourceCase_ == 1;
            }
            
            @Override
            public int getInstancedAbilityId() {
                if (this.sourceCase_ == 1) {
                    return (int)this.source_;
                }
                return 0;
            }
            
            public Builder setInstancedAbilityId(final int value) {
                this.sourceCase_ = 1;
                this.source_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInstancedAbilityId() {
                if (this.sourceCase_ == 1) {
                    this.sourceCase_ = 0;
                    this.source_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasInstancedModifierId() {
                return this.sourceCase_ == 2;
            }
            
            @Override
            public int getInstancedModifierId() {
                if (this.sourceCase_ == 2) {
                    return (int)this.source_;
                }
                return 0;
            }
            
            public Builder setInstancedModifierId(final int value) {
                this.sourceCase_ = 2;
                this.source_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInstancedModifierId() {
                if (this.sourceCase_ == 2) {
                    this.sourceCase_ = 0;
                    this.source_ = null;
                    this.onChanged();
                }
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
    
    public interface AbilityMixinRecoverInfoOrBuilder extends MessageOrBuilder
    {
        int getLocalId();
        
        List<Integer> getDataListList();
        
        int getDataListCount();
        
        int getDataList(final int p0);
        
        boolean getIsServerbuffModifier();
        
        List<MassivePropSyncInfoOuterClass.MassivePropSyncInfo> getMassivePropListList();
        
        MassivePropSyncInfoOuterClass.MassivePropSyncInfo getMassivePropList(final int p0);
        
        int getMassivePropListCount();
        
        List<? extends MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder> getMassivePropListOrBuilderList();
        
        MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder getMassivePropListOrBuilder(final int p0);
        
        boolean hasInstancedAbilityId();
        
        int getInstancedAbilityId();
        
        boolean hasInstancedModifierId();
        
        int getInstancedModifierId();
        
        AbilityMixinRecoverInfo.SourceCase getSourceCase();
    }
}
